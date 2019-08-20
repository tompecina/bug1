How to reproduce the bug:

1. Build the package:
     mvn package

2. Run it:
     ./run.sh

3. The original file empty.pdf was converted to out.pdf.
   While empty.pdf is accepted by qpdf, out.pdf is not, due
   to corrupt cross-reference table.
