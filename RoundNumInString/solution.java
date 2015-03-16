//solution by Josh_A (96 chrs)

String RoundNumInString(String S, boolean B) {
  return new java.math.BigDecimal(S).setScale(0, B ? 0 : 1) + "";
}
