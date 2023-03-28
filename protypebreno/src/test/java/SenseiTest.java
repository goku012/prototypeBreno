import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenseiTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Sensei sensei = new Sensei(123, "Aluno Original", new Aldeia("Rua A", 1), "Juiz de Fora");

        Sensei senseiClone = sensei.clone();
        senseiClone.setMatricula(456);
        senseiClone.setNome("Aluno Clonado");
        senseiClone.getAldeia().setNumero(2);

        assertEquals("Sensei{matricula=123, nome='Kakashi', aldeia=Aldeia{vila='Rua A', numero=1}, localNascimento='Konoha'}", sensei.toString());
        assertEquals("Sensei{matricula=456, nome='Konohamaru', aldeia=Aldeia{vila='Rua A', numero=2}, localNascimento='Konoha'}", senseiClone.toString());
    }
}