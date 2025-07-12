package com.study.online_learning_platform.Enum;

public enum District {
    QUAN_1("Quận 1"),
    QUAN_2("Quận 2"),
    QUAN_3("Quận 3"),
    QUAN_4("Quận 4"),
    QUAN_5("Quận 5"),
    QUAN_6("Quận 6"),
    QUAN_7("Quận 7"),
    QUAN_8("Quận 8"),
    QUAN_9("Quận 9"),
    QUAN_10("Quận 10"),
    QUAN_11("Quận 11"),
    QUAN_12("Quận 12"),
    BINH_THANH("Bình Thạnh"),
    GO_VAP("Gò Vấp"),
    TAN_BINH("Tân Bình"),
    TAN_PHU("Tân Phú"),
    PHU_NHUAN("Phú Nhuận"),
    BINH_TAN("Bình Tân"),
    THU_DUC("Thủ Đức"),
    NHA_BE("Nhà Bè"),
    CAN_GIO("Cần Giờ"),
    CU_CHI("Củ Chi"),
    HOC_MON("Hóc Môn");

    private final String districtName;

    District(String districtName) {
        this.districtName = districtName;
    }
}
