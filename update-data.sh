#!/usr/bin/bash
mkdir data/
wget "http://portal.core.edu.au/conf-ranks/?search=A&by=all&source=CORE2014&sort=atitle&page=1&do=Export" -O data/A.csv
wget "http://portal.core.edu.au/conf-ranks/?search=B&by=all&source=CORE2014&sort=atitle&page=1&do=Export" -O data/B.csv
wget "http://portal.core.edu.au/conf-ranks/?search=C&by=all&source=CORE2014&sort=atitle&page=1&do=Export" -O data/C.csv