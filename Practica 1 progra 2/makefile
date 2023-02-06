limpiar: 
	rm -rf bin
	rm -rf *.class
	rm -rf *.jar


compilar:limpiar
	mkdir bin
	find src -name "*.java" | xargs javac -cp bin -d bin

jar:compilar
	jar cvfm mates.jar manifest.txt -C bin .


