class Solution {
    public String intToRoman(int num) {
        int n = num;
        String s = "";

        if(n < 0) {
            return null;
        }
        while (n > 0) {
            if(n >= 1000) {
                s += "M";
                n -= 1000;
            }
            else if(n >= 900 && n < 1000) {
                s += "CM";
                n -= 900;
            }
            else if(n >= 500 && n < 900) {
                if(n >= 800) {
                    s += "DCCC";
                    n -= 800;
                }
                else if(n >= 700) {
                    s += "DCC";
                    n -= 700;
                }
                else if(n >= 600) {
                    s += "DC";
                    n -= 600;
                }
                else {
                    s += "D";
                    n -= 500;
                }
            }
            else if(n >= 400 && n < 500) {
                s += "CD";
                n -= 400;
            }
            else if(n >= 100 && n < 400) {
                if(n >= 300) {
                    s += "CCC";
                    n -= 300;
                }
                else if(n >= 200) {
                    s += "CC";
                    n -= 200;
                }
                else {
                    s += "C";
                    n -= 100;
                }
            }
            else if(n >= 90 && n < 100) {
                s += "XC";
                n -= 90;
            }
            else if(n >= 50 && n < 90) {
                if(n >= 80) {
                    s += "LXXX";
                    n -= 80;
                }
                else if(n >= 70) {
                    s += "LXX";
                    n -= 70;
                }
                else if(n >= 60) {
                    s += "LX";
                    n -= 60;
                }
                else {
                    s += "L";
                    n -= 50;
                }
            }
            else if(n >= 40 && n <50) {
                s += "XL";
                n -= 40;
            }
            else if(n >= 10 && n < 40) {
                if(n >= 30) {
                    s += "XXX";
                    n -= 30;
                }
                else if(n >= 20) {
                    s += "XX";
                    n -= 20;
                }
                else {
                    s += "X";
                    n -= 10;
                }
            }
            else if(n == 9) {
                s += "IX";
                n -= 9;
            }
            else if(n == 8) {
                s += "VIII";
                n -= 8;
            }
            else if(n == 7) {
                s += "VII";
                n -= 7;
            }
            else if(n == 6) {
                s += "VI";
                n -= 6;
            }
            else if(n == 5) {
                s += "V";
                n -= 5;
            }
            else if(n == 4) {
                s += "IV";
                n -= 4;
            }
            else if(n == 3) {
                s += "III";
                n -= 3;
            }
            else if(n == 2) {
                s += "II";
                n -= 2;
            }
            else if(n == 1) {
                s += "I";
                n -= 1;
            }
        }

        return s;
    }
}