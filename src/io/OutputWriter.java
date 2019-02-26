package io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import model.Problem;

public class OutputWriter {
	private final static Object ioLock = new Object();
	private final Problem problem;

	public OutputWriter(Problem problem) {
		this.problem = problem;
	}

	private String format() {
		StringBuffer s = new StringBuffer();

		// TODO implement correct formatting

		return s.toString();
	}

	public void print() {
		System.out.println(format());
	}

	public void write(String path) {
		String s = format();

		try {
			Path outputPath = prepareOutputFile(path);
			try (BufferedWriter writer = Files.newBufferedWriter(outputPath, StandardCharsets.US_ASCII)) {
				writer.write(s);
			}
		} catch (IOException e) {
			System.err.printf("Error writing output file: %s : %s%n", path, e.getMessage());
		}

	}

	private Path prepareOutputFile(String path) throws IOException {
		Path file = Paths.get(path);
		// use synchronization to avoid problems with the file system
		synchronized (ioLock) {
			if (!Files.exists(file)) {
				Files.createDirectories(file.getParent());
				Files.createFile(file);
				return file;
			}
			return file;
		}
	}
}
