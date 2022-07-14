Dada as classes a seguir:
Representa o total de despesas de um mês
public class DespesaMes {
 private int mes; // mes da despesa
 private float valor; // valor da despesa
 public DespesaMes(int mes, float valor) {
 this.mes = mes;
 this.valor = valor;
 }
 public int getMes() {
 return mes;
 }
 public float getValor() {
 return valor;
 }
}
Representa o total de despesas de um dia
public class DespesaDia extends DespesaMes {
 private int dia; // dia da despesa
 public DespesaDia(int dia, int mes, float valor) {
 super(mes, valor);
 this.dia = dia;
 }
 public int getDia() {
 return dia;
 }
}
