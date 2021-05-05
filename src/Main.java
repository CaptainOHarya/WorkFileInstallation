import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();

		File scr = new File("E:\\Games\\scr");
		File res = new File("E:\\Games\\res");
		File saveGames = new File("E:\\Games\\savegames");
		File temp = new File("E:\\Games\\temp");

		if (scr.mkdir())
			;
		sb.append("1. В каталоге Games создан подкаталог scr \n");
		if (res.mkdir())
			;
		sb.append("2. В каталоге Games создан подкаталог res \n");
		if (saveGames.mkdir())
			;
		sb.append("3. В каталоге Games создан подкаталог savegames \n");
		if (temp.mkdir())
			;
		sb.append("4. В каталоге Games создан подкаталог temp \n");

		File mains = new File("E:\\Games\\scr\\main");
		File test = new File("E:\\Games\\scr\\test");
		if (mains.mkdir())
			;
		sb.append("5. В подкаталоге scr создан подкаталог main \n");
		if (test.mkdir())
			;
		sb.append("6. В подкаталоге scr создан подкаталог test \n");

		File mainJava = new File("E:\\Games\\scr\\main", "Main.java");
		try {
			if (mainJava.createNewFile())
				sb.append("7. В подкаталоге main создан файл Main.java \n");
			// System.out.println("Файл создан");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			sb.append("7. Ошибка. В подкаталоге main создать файл Main.java нельзя \n");
		}

		File utilsJava = new File("E:\\Games\\scr\\main", "Utils.java");
		try {
			if (utilsJava.createNewFile())
				sb.append("8. В подкаталоге main создан файл Utils.java \n");

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			sb.append("8. Ошибка. В подкаталоге main создать файл Utils.java нельзя \n");
		}

		File drawables = new File("E:\\Games\\res\\drawables");
		File vectors = new File("E:\\Games\\res\\vectors");
		File icons = new File("E:\\Games\\res\\icons");

		if (drawables.mkdir())
			;
		sb.append("9. В подкаталоге res создан подкаталог drawables \n");
		if (vectors.mkdir())
			;
		sb.append("10. В подкаталоге res создан подкаталог vectors \n");
		if (icons.mkdir())
			;
		sb.append("11. В подкаталоге res создан подкаталог icons \n");

		File temps = new File("E:\\Games\\temp", "temp.txt");
		try {
			if (temps.createNewFile())
				sb.append("12. В подкаталоге temp создан файл temp.txt \n");

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			sb.append("12. Ошибка. В подкаталоге temp создать файл temp.txt нельзя \n");
		}

		// Запишем данные из StringBuilder в наш файл
		String text = sb.toString();

		// Решение через FileWriter
		try (FileWriter writer = new FileWriter("E:\\Games\\temp\\temp.txt")) {
			writer.write(text);
			writer.flush();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println(sb);

	}

}




