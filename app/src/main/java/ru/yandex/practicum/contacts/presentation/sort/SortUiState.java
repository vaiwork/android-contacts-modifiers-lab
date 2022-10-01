package ru.yandex.practicum.contacts.presentation.sort;

// класс UiState должен иметь package-private доступ
class SortUiState {

    // сделайте поля isApplyEnable и newSelectedSortType приватными
    private boolean isApplyEnable = false;
    private String newSelectedSortType = null;

    public boolean getIsApplyEnable() {
        return isApplyEnable;
    }

    public void setIsApplyEnable(boolean state) {
        isApplyEnable = state;
    }

    public String getNewSelectedSortType() {
        return newSelectedSortType;
    }

    public void setNewSelectedSortType(String selectedSortType) {
        newSelectedSortType = selectedSortType;
    }// реализуйте get и set методы для обоих полей
}
