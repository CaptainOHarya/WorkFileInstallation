import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		String path = ("E:" + File.separator + "Games");

		makeDir(path, "scr");
		makeDir(path, "res");
		makeDir(path, "savegames");
		makeDir(path, "temp");

		makeDir(path + File.separator + "scr", "main");
		makeDir(path + File.separator + "scr", "test");

		makeFile(path + File.separator + "scr" + File.separator + "main", "Main.java");
		makeFile(path + File.separator + "scr" + File.separator + "main", "Utils.java");

		makeDir(path + File.separator + "res", "drawables");
		makeDir(path + File.separator + "res", "vectors");
		makeDir(path + File.separator + "res", "icons");

		makeFile(path + File.separator + "temp", "temp.txt");

		// Запишем данные из StringBuilder в наш файл
		String text = sb.toString();
		String path1 = ("E:" + File.separator + "Games" + File.separator + "temp");
		

		// Решение через FileWriter
		try (FileWriter writer = new FileWriter(path1 + File.separator + "temp.txt", false)) {
			writer.write(text);
			writer.flush();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		// Можно вывести и в консоль)))
		System.out.println(sb);

	}

	private static void makeDir(String namePath, String nameDir) {

		File creatureDir = new File(namePath + File.separator + nameDir);
		if (creatureDir.mkdir());
		    sb.append("В каталоге " + namePath + " создан подкаталог " + nameDir + "\n");

	}

	private static void makeFile(String namePath, String nameFile) {
		File createFile = new File(namePath + File.separator + nameFile);
		try {
			if (createFile.createNewFile())
				sb.append("В каталоге " + namePath + " создан файл " + nameFile + "\n");

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			    sb.append("Ошибка. В каталоге " + namePath + " создать файл " + nameFile + " нельзя \n");
		}

	}

}


