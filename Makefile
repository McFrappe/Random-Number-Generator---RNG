all:
	javac -d classes *.java

run:
	java -cp classes frontend

clean:
	rm -rf classes/
