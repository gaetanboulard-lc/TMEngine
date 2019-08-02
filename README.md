# TMEngine

![alt text](https://maxprograms.com/images/openxliff_s.png "OpenXLIFF Filters")

An open source [Translation Memory](https://en.wikipedia.org/wiki/Translation_memory) Engine written in Java.

Source code of TMEngine is available under [Eclipse Public License 1.0](https://www.eclipse.org/org/documents/epl-v10.html).

## Requirements

- JDK 11 or newer is required for compiling and building.
- Apache Ant 1.10.6 or newer

## Building

- Checkout this repository.
- Point your JAVA_HOME variable to JDK 11
- Run `ant compile`.

## How To

Interface `ITmEngine` provides the following methods needed by translation tools:

- `storeTMX()` - Store the content of a TMX file into a translation memory.
- `searchTranslation()` - Search for matches of a text string.
- `concordanceSearch()` - Search for appearances of a given string inside memory segments.
- `exportMemory()` - Export the contents of a translation memory to a TMX file.


Two classes implement interface `ITmEngine`:

- `MapDbEngine` : a translation memory engine built using MapDB
- `SQLEngine` : a translation memory designed to be used with MariaDB
