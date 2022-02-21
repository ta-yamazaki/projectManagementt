package com.project.management.domain.model.progress;

/**
 * 案件の状態
 */
public enum Status {
    引き合い,
    ヒアリング,
    提案済み,
    契約交渉中,
    受注,
    失注,
    ;

    @Override
    public String toString() {
        return name();
    }
}
