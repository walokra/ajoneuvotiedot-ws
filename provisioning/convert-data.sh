#!/bin/bash

# 1. Remove the header row
# 2. Change the field separator because there are decimals in the data. The field separator , is changed to |.
# 3. Convert to UTF-8
unzip $1 | awk 'BEGIN{FS=OFS="\""} {for (i=1;i<=NF;i+=2) gsub(/,/,"|",$i)}1' | iconv -f iso8859-15 -t utf-8 > data_utf8.csv
