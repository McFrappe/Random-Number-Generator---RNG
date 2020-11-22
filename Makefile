all:
	javac -d classes *.java

run: all
	java -cp classes frontend

clean:
	rm -rf classes/
