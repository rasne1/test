package com.ktdsuniversity.edu.practice;

import java.util.*;

public class Airport {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 비행기 목록
        List<AirPlane> airplanes = new ArrayList<>();

        airplanes.add(new AirPlane("0002",
                Arrays.asList(true, true, true, true, false, true, true, true, true)));

        airplanes.add(new AirPlane("0003",
                Arrays.asList(false, false, false, false, false, false, false, false, false)));

        while (true) {

            System.out.println("비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.");
            System.out.print("비행기 편의 이름을 입력하세요: ");
            String input = sc.nextLine();

            AirPlane selected = null;

            // 비행기 찾기
            for (AirPlane plane : airplanes) {
                if (plane.getFlight().equals(input)) {
                    selected = plane;
                    break;
                }
            }

            if (selected == null) {
                System.out.println("\"" + input + "\" 편은 존재하지 않습니다.\n");
                continue;
            }

            // 좌석 출력
            System.out.println("\n\"" + selected.getFlight() + "\" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");
            printSeats(selected.getSeats());

            // 예약 가능한 좌석 있는지 확인
            if (!selected.getSeats().contains(true)) {
                System.out.println("\n예약 가능한 좌석이 없습니다. 다른 비행기 편을 이용해 주세요.\n");
                continue;
            }

            // 좌석 예약
            while (true) {
                System.out.print("\n좌석 예약을 하려면 번호를 입력하세요: ");
                int seatNo = Integer.parseInt(sc.nextLine());
                int index = seatNo - 1;

                if (!selected.getSeats().get(index)) {
                    System.out.println("\"" + seatNo + "\"번 좌석은 이미 예약된 좌석입니다.");
                    continue;
                }

                System.out.print("\"" + seatNo + "\"번 좌석을 예약하시겠습니까? (y/N): ");
                String yn = sc.nextLine();

                if (yn.equalsIgnoreCase("y")) {
                    selected.getSeats().set(index, false);
                    System.out.println("\n\"" + seatNo + "\"번 좌석이 예약되었습니다.\n");
                    break;
                }
            }

            // 변경된 좌석 다시 출력
            System.out.println("\"" + selected.getFlight() + "\" 편의 좌석 현황입니다.");
            printSeats(selected.getSeats());
            System.out.println();
        }
    }

    private static void printSeats(List<Boolean> seats) {
        for (int i = 0; i < seats.size(); i++) {
            System.out.print((i + 1) + ": " + (seats.get(i) ? "O" : "X"));
            if (i < seats.size() - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
