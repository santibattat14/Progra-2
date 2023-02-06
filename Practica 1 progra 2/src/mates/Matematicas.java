/*Copyright [2023] [Pablo de la Cruz Rodríguez y Santiago Battat Bevilacqua] Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
*/


package mates;
import java.util.concurrent.ThreadLocalRandom;
public class Matematicas{
	public static double generarNumeroPi(int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
        // Generar dos números aleatorios entre -1 y 1.
        double x = ThreadLocalRandom.current().nextDouble() * 2 - 1;
        double y = ThreadLocalRandom.current().nextDouble() * 2 - 1;

        // Aplicar teorema de Pitágoras.
        double h = x * x + y * y;

        // Verificar si el tiro cayó dentro del círculo.
        if (h <= 1) {
            sum++;
        }
    }
    return 4 * ((double) sum / n);

	}
}

