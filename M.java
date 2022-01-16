import java.util.Scanner;

public class M{
    public static void main(String[] args) {
        
        Scanner m = new Scanner(System.in);
        System.out.print("annual salary:");
        double y = m.nextDouble();

        double[] t_d = {0, 0, 30000, 130000, 490000, 2410000};

        for(int n = 0; n < t_d.length; n++){
            if(t_d[n] == 0){
                if(y < 250000){
                    double m_r = y / 12;
                    System.out.println("monthly rate:" + String.format("%.2f", m_r));

                    double d_r = m_r / 22;
                    System.out.println("daily rate:" + String.format("%.2f", d_r));

                    double h_r = d_r / 8;
                    System.out.println("hourly rat:" + String.format("%.2f", h_r));

                    double a_t_d = 0.0;
                    System.out.println("annual tax deduction:" + String.format("%.2f", a_t_d));

                    double m_t_d = 0.0;
                    System.out.println("monthly tax deduction:" + String.format("%.2f", m_t_d));

                    double n_p = m_r - m_t_d;
                    System.out.println("net pay:" + String.format("%.2f", n_p));
                }

                else if(y >= 250000 && y < 400000){
                    double tax_deduction = y - 250000 * .20;

                    double m_r = y / 12;
                    System.out.println("monthly rate:" + String.format("%.2f", m_r));

                    double d_r = m_r / 22;
                    System.out.println("daily rate:" + String.format("%.2f", d_r));

                    double h_r = d_r / 8;
                    System.out.println("hourly rat:" + String.format("%.2f", h_r));

                    double a_t_d = tax_deduction;
                    System.out.println("annual tax deduction:" + String.format("%.2f", a_t_d));

                    double m_t_d = a_t_d / 12;
                    System.out.println("monthly tax deduction:" + String.format("%.2f", m_t_d));

                    double n_p = m_r - m_t_d;
                    System.out.println("net pay:" + String.format("%.2f", n_p));
                }
            }

            else if(t_d[n] == 30000){
                if(y >= 400000 && y < 800000){
                    double tax_excess = y - 400000;
                    double tax_deduction = 0.25 * tax_excess + 30000;
        
                    //variables to compute values
                    double m_r = y / 12;
                    System.out.println("monthly rate:" + String.format("%.2f", m_r));

                    double d_r = m_r / 22;
                    System.out.println("daily rate:" + String.format("%.2f", d_r));

                    double h_r = d_r / 8;
                    System.out.println("hourly rat:" + String.format("%.2f", h_r));

                    double a_t_d = tax_deduction;
                    System.out.println("annual tax deduction:" + String.format("%.2f", a_t_d));

                    double m_t_d = a_t_d / 12;
                    System.out.println("monthly tax deduction:" + String.format("%.2f", m_t_d));

                    double n_p = m_r - m_t_d;
                    System.out.println("net pay:" + String.format("%.2f", n_p));
                }
            }

            else if(t_d[n] == 130000){
                if(y >= 800000 && y < 2000000){
                    double tax_excess = y - 800000;
                    double tax_deduction = 0.25 * tax_excess + 130000;
        
                    double m_r = y / 12;
                    System.out.println("monthly rate:" + String.format("%.2f", m_r));

                    double d_r = m_r / 22;
                    System.out.println("daily rate:" + String.format("%.2f", d_r));

                    double h_r = d_r / 8;
                    System.out.println("hourly rat:" + String.format("%.2f", h_r));

                    double a_t_d = tax_deduction;
                    System.out.println("annual tax deduction:" + String.format("%.2f", a_t_d));

                    double m_t_d = a_t_d / 12;
                    System.out.println("monthly tax deduction:" + String.format("%.2f", m_t_d));

                    double n_p = m_r - m_t_d;
                    System.out.println("net pay:" + String.format("%.2f", n_p));
                }
            }

            else if(t_d[n] == 490000){
                if(y >= 2000000 && y < 8000000){
                    double tax_excess = y - 2000000;
                    double tax_deduction = 0.25 * tax_excess + 490000;

                    double m_r = y / 12;
                    System.out.println("monthly rate:" + String.format("%.2f", m_r));

                    double d_r = m_r / 22;
                    System.out.println("daily rate:" + String.format("%.2f", d_r));

                    double h_r = d_r / 8;
                    System.out.println("hourly rat:" + String.format("%.2f", h_r));

                    double a_t_d = tax_deduction;
                    System.out.println("annual tax deduction:" + String.format("%.2f", a_t_d));

                    double m_t_d = a_t_d / 12;
                    System.out.println("monthly tax deduction:" + String.format("%.2f", m_t_d));

                    double n_p = m_r - m_t_d;
                    System.out.println("net pay:" + String.format("%.2f", n_p));
                }
            }

            else if(t_d[n] == 2410000){
                if(y >= 8000000){
                    double tax_excess = y - 8000000;
                    double tax_deduction = 0.25 * tax_excess + 2410000;

                    double m_r = y / 12;
                    System.out.println("monthly rate:" + String.format("%.2f", m_r));

                    double d_r = m_r / 22;
                    System.out.println("daily rate:" + String.format("%.2f", d_r));

                    double h_r = d_r / 8;
                    System.out.println("hourly rat:" + String.format("%.2f", h_r));

                    double a_t_d = tax_deduction;
                    System.out.println("annual tax deduction:" + String.format("%.2f", a_t_d));

                    double m_t_d = a_t_d / 12;
                    System.out.println("monthly tax deduction:" + String.format("%.2f", m_t_d));

                    double n_p = m_r - m_t_d;
                    System.out.println("net pay:" + String.format("%.2f", n_p));
                }
            }

        }
    }
}