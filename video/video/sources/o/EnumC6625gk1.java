package o;

/* renamed from: o.gk1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC6625gk1 {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    
    public final int[] X;
    public final int Y;

    EnumC6625gk1(int[] iArr, int i) {
        this.X = iArr;
        this.Y = i;
    }

    public static EnumC6625gk1 e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 7) {
                                    if (i != 8) {
                                        if (i != 9) {
                                            if (i == 13) {
                                                return HANZI;
                                            }
                                            throw new IllegalArgumentException();
                                        }
                                        return FNC1_SECOND_POSITION;
                                    }
                                    return KANJI;
                                }
                                return ECI;
                            }
                            return FNC1_FIRST_POSITION;
                        }
                        return BYTE;
                    }
                    return STRUCTURED_APPEND;
                }
                return ALPHANUMERIC;
            }
            return NUMERIC;
        }
        return TERMINATOR;
    }

    public int g() {
        return this.Y;
    }

    public int h(WE2 we2) {
        char c;
        int j = we2.j();
        if (j <= 9) {
            c = 0;
        } else if (j <= 26) {
            c = 1;
        } else {
            c = 2;
        }
        return this.X[c];
    }
}
