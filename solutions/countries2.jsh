1) Returns whether there is at least one country with the word island in its name ignoring case.

countries.stream().map(country -> country.getName().toLowerCase()).anyMatch(country -> country.contains("island"));

2) Returns the first country name that contains the word island ignoring case.

countries.stream().map(country -> country.getName().toLowerCase()).filter(country -> country.contains("island")).findFirst();

3) Prints each country name in which the first and the last letters are the same ignoring case.

countries.stream().map(country -> country.getName().toLowerCase()).filter(country -> country.charAt(0) == country.charAt(country.length() - 1)).forEach(System.out::println)

4) Prints the populations of the first ten least populous countries (required intermediate operation: sorted, limit)).

countries.stream().mapToLong(country -> country.getPopulation()).sorted().limit(10).forEach(System.out::println)

10) Prints the names of countries with null area.
countries.stream(). filter(country -> country.getArea() == null). map(country -> country.getName()). forEach(System.out::println)

14) Returns the largest country with non-null area.
countries.stream(). filter(country -> country.getArea() == null). map(country -> country.getName()). forEach(System.out::println)
