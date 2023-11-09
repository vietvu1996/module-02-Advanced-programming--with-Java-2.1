package menu.MenuChairman;

import menu.Command;

import java.util.Scanner;

public class CommandOverallManagement implements Command {


    @Override
    public void execute() {
        System.out.println("""
                1.Mục tiêu : Đội bóng phải đạt thứ hạng trong giải quốc nội
                2.Chiến lược:
                2.1. Ưu tiên đào tạo cầu thủ trẻ.
                2.2 Quản lý phòng thay để tránh xung đột giữa các cầu thủ.
                2.3 Phải có bản sắc chiến thuật riêng của câu lạc bộ.
                """);
    }
}