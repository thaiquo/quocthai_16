package buoi1;


    public class Main1 {
        public static void main(String[] args) {
            String[] poems = {
                    "công cha như núi thái sơn",
                    "nghĩa mẹ như nước trong nguồn chảy ra",
                    "một lòng thờ mẹ kính cha",
                    "cho tròn chữ hiếu mới là đạo con"
            };

            formatPoems(poems);
        }

        public static void formatPoems(String[] poems) {
            int maxLength = 0;
            for (String poem : poems) {
                if (poem.length() > maxLength) {
                    maxLength = poem.length();
                }
            }

            for (String poem : poems) {
                int padding = (maxLength - poem.length()) / 2;
                String formattedPoem = String.format("%" + (padding + poem.length()) + "s", poem);
                System.out.println(formattedPoem);
            }
        }

}
