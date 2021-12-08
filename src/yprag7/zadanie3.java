package yprag7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

        public class zadanie3 {
            public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int[] mass = new int[5];
                System.out.println("Введите элементы массива ");
                for (int i = 0; i < mass.length; i++) {
                    String el = reader.readLine();
                    int element = Integer.parseInt(el);
                    mass[i] = element;
                }

                MinMax macAndSr = mass(mass);
                System.out.println(macAndSr.max + "   " + macAndSr.sr);
            }

            static MinMax mass(int[] m) {
                double sr ;
                double sum = 0;
                int max = 0;
                for (int i = 1; i < m.length; i++) {
                    sum = sum + m[i];
                    if (m[0] < m[i]) {
                        m[0] = m[i];
                        max = m[i];
                    }

                }
                sr = sum / m.length;
                MinMax result = new MinMax();
                result.max = max;
                result.sr = sr;
                return result;
            }
        }
