# CORE Conference Ranking as a Service

## Running instance

### Example 1:
```bash
wget "http://tommaso-soru.it/coreaas/ranking/?abbrev=ICSE" -O ICSE.json
```
will yield
```json
[
  {
    "id":     1209,
    "name":   "International Conference on Software Engineering",
    "abbrev": "ICSE",
    "rank":   "A*"
  }
]
```

### Example 2:
```bash
wget "http://tommaso-soru.it/coreaas/ranking/?abbrev=ISWC" -O ISWC.json
```
will yield
```json
[
  {
    "id":     708,
    "name":   "IEEE International Symposium on Wearable Computing",
    "abbrev": "ISWC",
    "rank":   "A*"
  },
  {
    "id":     1338,
    "name":   "International Semantic Web Conference",
    "abbrev": "ISWC",
    "rank":   "A"
  }
]
```
