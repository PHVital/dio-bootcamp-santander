package model;

import java.util.*;
import java.util.stream.Collectors;

import static model.GameStatusEnum.COMPLETE;
import static model.GameStatusEnum.INCOMPLETE;
import static model.GameStatusEnum.NON_STARTED;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Board {
    private final List<List<Space>> spaces;

    public Board(final List<List<Space>> spaces) {
        this.spaces = spaces;
    }

    public List<List<Space>> getSpaces() {
        return spaces;
    }

    public GameStatusEnum getStatus() {
        if (spaces.stream().flatMap(Collection::stream).noneMatch(s -> !s.isFixed() && nonNull(s.getActual()))) {
            return NON_STARTED;
        }

        return spaces.stream().flatMap(Collection::stream).anyMatch(s -> isNull(s.getActual())) ? INCOMPLETE : COMPLETE;
    }

    public boolean hasErrors() {
        if(getStatus() == NON_STARTED) {
            return false;
        }

        return spaces.stream().flatMap(Collection::stream).anyMatch(s -> nonNull(s.getActual()) && !s.getActual().equals(s.getExpected()));
    }

    public boolean changeValue(final int col, final int row, final int value) {
        var space = spaces.get(col).get(row);
        if (space.isFixed()) {
            return false;
        }

        space.setActual(value);
        return true;
    }

    public boolean clearValue(final int col, final int row) {
        var space = spaces.get(col).get(row);
        if (space.isFixed()) {
            return false;
        }

        space.clearSpace();
        return true;
    }

    public void reset() {
        spaces.forEach(c ->c.forEach(Space::clearSpace));
    }

    public boolean gameIsFinished() {
        return !hasErrors() && getStatus().equals(COMPLETE);
    }

    private boolean isColValida(int colIndex) {
        List<Integer> numerosNaColuna = this.spaces.get(colIndex).stream().map(Space::getActual).filter(Objects::nonNull).collect(Collectors.toList());
        Set<Integer> numerosUnicos = new HashSet<>(numerosNaColuna);
        return numerosNaColuna.size() == numerosUnicos.size();
    }

    private boolean isRowValida(int rowIndex) {
        List<Integer> numerosNaLinha = this.spaces.stream().map(coluna -> coluna.get(rowIndex).getActual()).filter(Objects::nonNull).collect(Collectors.toList());
        Set<Integer> numerosUnicos = new HashSet<>(numerosNaLinha);
        return numerosNaLinha.size() == numerosUnicos.size();
    }

    private boolean isBoxValido(int row, int col) {
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        List<Integer> numerosNoBox = new ArrayList<>();

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                Integer valor = this.spaces.get(j).get(i).getActual();
                if (Objects.nonNull(valor)) {
                    numerosNoBox.add(valor);
                }
            }
        }

        Set<Integer> numerosUnicos = new HashSet<>(numerosNoBox);
        return numerosNoBox.size() == numerosUnicos.size();
    }

    public boolean isBoardValido() {
        for (int i = 0; i < 9; i++) {
            if (!isRowValida(i) || !isColValida(i)) {
                return false;
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isBoxValido(i, j)) {
                    return false;
                }
            }
        }

        return true;
    }
}
