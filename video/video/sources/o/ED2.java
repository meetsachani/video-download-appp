package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8046mW0(name = "Utf8")
@InterfaceC8303na2({"SMAP\nUtf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utf8.kt\nokio/Utf8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,559:1\n397#1,9:563\n127#1:572\n406#1,20:574\n440#1,4:595\n127#1:599\n446#1,10:601\n127#1:611\n456#1,5:612\n127#1:617\n461#1,24:618\n500#1,4:643\n127#1:647\n506#1,2:649\n127#1:651\n510#1,10:652\n127#1:662\n520#1,5:663\n127#1:668\n525#1,5:669\n127#1:674\n530#1,28:675\n397#1,9:704\n127#1:713\n406#1,20:715\n440#1,4:736\n127#1:740\n446#1,10:742\n127#1:752\n456#1,5:753\n127#1:758\n461#1,24:759\n500#1,4:784\n127#1:788\n506#1,2:790\n127#1:792\n510#1,10:793\n127#1:803\n520#1,5:804\n127#1:809\n525#1,5:810\n127#1:815\n530#1,28:816\n127#1:844\n127#1:846\n127#1:848\n127#1:850\n127#1:852\n127#1:854\n127#1:856\n127#1:858\n127#1:860\n1#2:560\n74#3:561\n68#3:562\n74#3:573\n68#3:594\n74#3:600\n68#3:642\n74#3:648\n68#3:703\n74#3:714\n68#3:735\n74#3:741\n68#3:783\n74#3:789\n74#3:845\n74#3:847\n74#3:849\n74#3:851\n74#3:853\n74#3:855\n74#3:857\n74#3:859\n74#3:861\n*S KotlinDebug\n*F\n+ 1 Utf8.kt\nokio/Utf8\n*L\n228#1:563,9\n228#1:572\n228#1:574,20\n232#1:595,4\n232#1:599\n232#1:601,10\n232#1:611\n232#1:612,5\n232#1:617\n232#1:618,24\n236#1:643,4\n236#1:647\n236#1:649,2\n236#1:651\n236#1:652,10\n236#1:662\n236#1:663,5\n236#1:668\n236#1:669,5\n236#1:674\n236#1:675,28\n277#1:704,9\n277#1:713\n277#1:715,20\n281#1:736,4\n281#1:740\n281#1:742,10\n281#1:752\n281#1:753,5\n281#1:758\n281#1:759,24\n285#1:784,4\n285#1:788\n285#1:790,2\n285#1:792\n285#1:793,10\n285#1:803\n285#1:804,5\n285#1:809\n285#1:810,5\n285#1:815\n285#1:816,28\n405#1:844\n443#1:846\n455#1:848\n460#1:850\n503#1:852\n507#1:854\n519#1:856\n524#1:858\n529#1:860\n127#1:561\n226#1:562\n228#1:573\n230#1:594\n232#1:600\n234#1:642\n236#1:648\n275#1:703\n277#1:714\n279#1:735\n281#1:741\n283#1:783\n285#1:789\n405#1:845\n443#1:847\n455#1:849\n460#1:851\n503#1:853\n507#1:855\n519#1:857\n524#1:859\n529#1:861\n*E\n"})
/* loaded from: classes4.dex */
public final class ED2 {
    public static final byte a = 63;
    public static final char b = 65533;
    public static final int c = 65533;
    public static final int d = 55232;
    public static final int e = 56320;
    public static final int f = 3968;
    public static final int g = -123008;
    public static final int h = 3678080;

    public static final boolean a(int i) {
        if (i < 0 || i >= 32) {
            if (127 <= i && i < 160) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean b(byte b2) {
        if ((b2 & C2638Cg0.o7) == 128) {
            return true;
        }
        return false;
    }

    public static final int c(@NotNull byte[] bArr, int i, int i2, @NotNull HA0<? super Integer, C7458kA2> ha0) {
        Integer valueOf = Integer.valueOf((int) c);
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "yield");
        int i3 = i + 1;
        if (i2 <= i3) {
            ha0.invoke(valueOf);
            return 1;
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i3];
        if ((b3 & C2638Cg0.o7) == 128) {
            int i4 = (b3 ^ 3968) ^ (b2 << 6);
            if (i4 < 128) {
                ha0.invoke(valueOf);
                return 2;
            }
            ha0.invoke(Integer.valueOf(i4));
            return 2;
        }
        ha0.invoke(valueOf);
        return 1;
    }

    public static final int d(@NotNull byte[] bArr, int i, int i2, @NotNull HA0<? super Integer, C7458kA2> ha0) {
        Integer valueOf = Integer.valueOf((int) c);
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "yield");
        int i3 = i + 2;
        if (i2 <= i3) {
            ha0.invoke(valueOf);
            int i4 = i + 1;
            if (i2 <= i4 || (bArr[i4] & C2638Cg0.o7) != 128) {
                return 1;
            }
            return 2;
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if ((b3 & C2638Cg0.o7) == 128) {
            byte b4 = bArr[i3];
            if ((b4 & C2638Cg0.o7) == 128) {
                int i5 = ((b4 ^ (-123008)) ^ (b3 << 6)) ^ (b2 << C8077mf.n);
                if (i5 < 2048) {
                    ha0.invoke(valueOf);
                    return 3;
                } else if (55296 <= i5 && i5 < 57344) {
                    ha0.invoke(valueOf);
                    return 3;
                } else {
                    ha0.invoke(Integer.valueOf(i5));
                    return 3;
                }
            }
            ha0.invoke(valueOf);
            return 2;
        }
        ha0.invoke(valueOf);
        return 1;
    }

    public static final int e(@NotNull byte[] bArr, int i, int i2, @NotNull HA0<? super Integer, C7458kA2> ha0) {
        Integer valueOf = Integer.valueOf((int) c);
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "yield");
        int i3 = i + 3;
        if (i2 <= i3) {
            ha0.invoke(valueOf);
            int i4 = i + 1;
            if (i2 <= i4 || (bArr[i4] & C2638Cg0.o7) != 128) {
                return 1;
            }
            int i5 = i + 2;
            if (i2 <= i5 || (bArr[i5] & C2638Cg0.o7) != 128) {
                return 2;
            }
            return 3;
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if ((b3 & C2638Cg0.o7) == 128) {
            byte b4 = bArr[i + 2];
            if ((b4 & C2638Cg0.o7) == 128) {
                byte b5 = bArr[i3];
                if ((b5 & C2638Cg0.o7) == 128) {
                    int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << C8077mf.n)) ^ (b2 << C8077mf.u);
                    if (i6 > 1114111) {
                        ha0.invoke(valueOf);
                        return 4;
                    } else if (55296 <= i6 && i6 < 57344) {
                        ha0.invoke(valueOf);
                        return 4;
                    } else if (i6 < 65536) {
                        ha0.invoke(valueOf);
                        return 4;
                    } else {
                        ha0.invoke(Integer.valueOf(i6));
                        return 4;
                    }
                }
                ha0.invoke(valueOf);
                return 3;
            }
            ha0.invoke(valueOf);
            return 2;
        }
        ha0.invoke(valueOf);
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
        if ((r12[r2] & o.C2638Cg0.o7) == 128) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f1, code lost:
        if ((r12[r2] & o.C2638Cg0.o7) == 128) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(@NotNull byte[] bArr, int i, int i2, @NotNull HA0<? super Character, C7458kA2> ha0) {
        char c2;
        char c3;
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "yield");
        while (i < i2) {
            byte b2 = bArr[i];
            if (b2 >= 0) {
                ha0.invoke(Character.valueOf((char) b2));
                i++;
                while (i < i2) {
                    byte b3 = bArr[i];
                    if (b3 >= 0) {
                        i++;
                        ha0.invoke(Character.valueOf((char) b3));
                    }
                }
            } else {
                int i3 = 2;
                if ((b2 >> 5) == -2) {
                    int i4 = i + 1;
                    if (i2 > i4) {
                        byte b4 = bArr[i4];
                        if ((b4 & C2638Cg0.o7) == 128) {
                            int i5 = (b2 << 6) ^ (b4 ^ 3968);
                            if (i5 < 128) {
                                c2 = (char) c;
                            } else {
                                c2 = (char) i5;
                            }
                            ha0.invoke(Character.valueOf(c2));
                            C7458kA2 c7458kA2 = C7458kA2.a;
                            i += i3;
                        }
                    }
                    ha0.invoke(Character.valueOf((char) c));
                    C7458kA2 c7458kA22 = C7458kA2.a;
                    i3 = 1;
                    i += i3;
                } else if ((b2 >> 4) == -2) {
                    int i6 = i + 2;
                    if (i2 <= i6) {
                        ha0.invoke(Character.valueOf((char) c));
                        C7458kA2 c7458kA23 = C7458kA2.a;
                        int i7 = i + 1;
                        if (i2 > i7) {
                        }
                        i3 = 1;
                        i += i3;
                    } else {
                        byte b5 = bArr[i + 1];
                        if ((b5 & C2638Cg0.o7) == 128) {
                            byte b6 = bArr[i6];
                            if ((b6 & C2638Cg0.o7) == 128) {
                                int i8 = (b2 << C8077mf.n) ^ ((b6 ^ (-123008)) ^ (b5 << 6));
                                if (i8 < 2048 || (55296 <= i8 && i8 < 57344)) {
                                    c3 = (char) c;
                                } else {
                                    c3 = (char) i8;
                                }
                                ha0.invoke(Character.valueOf(c3));
                                C7458kA2 c7458kA24 = C7458kA2.a;
                                i3 = 3;
                                i += i3;
                            } else {
                                ha0.invoke(Character.valueOf((char) c));
                                C7458kA2 c7458kA25 = C7458kA2.a;
                                i += i3;
                            }
                        } else {
                            ha0.invoke(Character.valueOf((char) c));
                            C7458kA2 c7458kA26 = C7458kA2.a;
                            i3 = 1;
                            i += i3;
                        }
                    }
                } else if ((b2 >> 3) == -2) {
                    int i9 = i + 3;
                    if (i2 <= i9) {
                        ha0.invoke((char) 65533);
                        C7458kA2 c7458kA27 = C7458kA2.a;
                        int i10 = i + 1;
                        if (i2 > i10 && (bArr[i10] & C2638Cg0.o7) == 128) {
                            int i11 = i + 2;
                            if (i2 > i11) {
                            }
                            i += i3;
                        }
                        i3 = 1;
                        i += i3;
                    } else {
                        byte b7 = bArr[i + 1];
                        if ((b7 & C2638Cg0.o7) == 128) {
                            byte b8 = bArr[i + 2];
                            if ((b8 & C2638Cg0.o7) == 128) {
                                byte b9 = bArr[i9];
                                if ((b9 & C2638Cg0.o7) == 128) {
                                    int i12 = (b2 << C8077mf.u) ^ (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << C8077mf.n));
                                    if (i12 > 1114111 || ((55296 <= i12 && i12 < 57344) || i12 < 65536 || i12 == 65533)) {
                                        ha0.invoke((char) 65533);
                                    } else {
                                        ha0.invoke(Character.valueOf((char) ((i12 >>> 10) + d)));
                                        ha0.invoke(Character.valueOf((char) ((i12 & 1023) + e)));
                                    }
                                    C7458kA2 c7458kA28 = C7458kA2.a;
                                    i3 = 4;
                                } else {
                                    ha0.invoke((char) 65533);
                                    C7458kA2 c7458kA29 = C7458kA2.a;
                                    i3 = 3;
                                }
                            } else {
                                ha0.invoke((char) 65533);
                                C7458kA2 c7458kA210 = C7458kA2.a;
                            }
                            i += i3;
                        } else {
                            ha0.invoke((char) 65533);
                            C7458kA2 c7458kA211 = C7458kA2.a;
                            i3 = 1;
                            i += i3;
                        }
                    }
                } else {
                    ha0.invoke((char) 65533);
                    i++;
                }
            }
        }
    }

    public static final void g(@NotNull String str, int i, int i2, @NotNull HA0<? super Byte, C7458kA2> ha0) {
        int i3;
        char charAt;
        C6562gT0.p(str, "<this>");
        C6562gT0.p(ha0, "yield");
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (C6562gT0.t(charAt2, 128) < 0) {
                ha0.invoke(Byte.valueOf((byte) charAt2));
                i++;
                while (i < i2 && C6562gT0.t(str.charAt(i), 128) < 0) {
                    ha0.invoke(Byte.valueOf((byte) str.charAt(i)));
                    i++;
                }
            } else {
                if (C6562gT0.t(charAt2, 2048) < 0) {
                    ha0.invoke(Byte.valueOf((byte) ((charAt2 >> 6) | CK1.x)));
                    ha0.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (55296 <= charAt2 && charAt2 < 57344) {
                    if (C6562gT0.t(charAt2, 56319) <= 0 && i2 > (i3 = i + 1) && 56320 <= (charAt = str.charAt(i3)) && charAt < 57344) {
                        int charAt3 = ((charAt2 << '\n') + str.charAt(i3)) - 56613888;
                        ha0.invoke(Byte.valueOf((byte) ((charAt3 >> 18) | 240)));
                        ha0.invoke(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                        ha0.invoke(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                        ha0.invoke(Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                        i += 2;
                    } else {
                        ha0.invoke(Byte.valueOf((byte) a));
                    }
                } else {
                    ha0.invoke(Byte.valueOf((byte) ((charAt2 >> '\f') | 224)));
                    ha0.invoke(Byte.valueOf((byte) (((charAt2 >> 6) & 63) | 128)));
                    ha0.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                }
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
        if ((r11[r1] & o.C2638Cg0.o7) == 128) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00dc, code lost:
        if ((r11[r1] & o.C2638Cg0.o7) == 128) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(@NotNull byte[] bArr, int i, int i2, @NotNull HA0<? super Integer, C7458kA2> ha0) {
        Integer valueOf = Integer.valueOf((int) c);
        C6562gT0.p(bArr, "<this>");
        C6562gT0.p(ha0, "yield");
        while (i < i2) {
            byte b2 = bArr[i];
            if (b2 >= 0) {
                ha0.invoke(Integer.valueOf(b2));
                i++;
                while (i < i2) {
                    byte b3 = bArr[i];
                    if (b3 >= 0) {
                        i++;
                        ha0.invoke(Integer.valueOf(b3));
                    }
                }
            } else {
                int i3 = 2;
                if ((b2 >> 5) == -2) {
                    int i4 = i + 1;
                    if (i2 > i4) {
                        byte b4 = bArr[i4];
                        if ((b4 & C2638Cg0.o7) == 128) {
                            int i5 = (b2 << 6) ^ (b4 ^ 3968);
                            if (i5 < 128) {
                                ha0.invoke(valueOf);
                            } else {
                                ha0.invoke(Integer.valueOf(i5));
                            }
                            C7458kA2 c7458kA2 = C7458kA2.a;
                            i += i3;
                        }
                    }
                    ha0.invoke(valueOf);
                    C7458kA2 c7458kA22 = C7458kA2.a;
                    i3 = 1;
                    i += i3;
                } else if ((b2 >> 4) == -2) {
                    int i6 = i + 2;
                    if (i2 <= i6) {
                        ha0.invoke(valueOf);
                        C7458kA2 c7458kA23 = C7458kA2.a;
                        int i7 = i + 1;
                        if (i2 > i7) {
                        }
                        i3 = 1;
                        i += i3;
                    } else {
                        byte b5 = bArr[i + 1];
                        if ((b5 & C2638Cg0.o7) == 128) {
                            byte b6 = bArr[i6];
                            if ((b6 & C2638Cg0.o7) == 128) {
                                int i8 = (b2 << C8077mf.n) ^ ((b6 ^ (-123008)) ^ (b5 << 6));
                                if (i8 < 2048 || (55296 <= i8 && i8 < 57344)) {
                                    ha0.invoke(valueOf);
                                } else {
                                    ha0.invoke(Integer.valueOf(i8));
                                }
                                C7458kA2 c7458kA24 = C7458kA2.a;
                                i3 = 3;
                                i += i3;
                            } else {
                                ha0.invoke(valueOf);
                                C7458kA2 c7458kA25 = C7458kA2.a;
                                i += i3;
                            }
                        } else {
                            ha0.invoke(valueOf);
                            C7458kA2 c7458kA26 = C7458kA2.a;
                            i3 = 1;
                            i += i3;
                        }
                    }
                } else if ((b2 >> 3) == -2) {
                    int i9 = i + 3;
                    if (i2 <= i9) {
                        ha0.invoke(valueOf);
                        C7458kA2 c7458kA27 = C7458kA2.a;
                        int i10 = i + 1;
                        if (i2 > i10 && (bArr[i10] & C2638Cg0.o7) == 128) {
                            int i11 = i + 2;
                            if (i2 > i11) {
                            }
                            i += i3;
                        }
                        i3 = 1;
                        i += i3;
                    } else {
                        byte b7 = bArr[i + 1];
                        if ((b7 & C2638Cg0.o7) == 128) {
                            byte b8 = bArr[i + 2];
                            if ((b8 & C2638Cg0.o7) == 128) {
                                byte b9 = bArr[i9];
                                if ((b9 & C2638Cg0.o7) == 128) {
                                    int i12 = (b2 << C8077mf.u) ^ (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << C8077mf.n));
                                    if (i12 > 1114111 || ((55296 <= i12 && i12 < 57344) || i12 < 65536)) {
                                        ha0.invoke(valueOf);
                                    } else {
                                        ha0.invoke(Integer.valueOf(i12));
                                    }
                                    C7458kA2 c7458kA28 = C7458kA2.a;
                                    i3 = 4;
                                } else {
                                    ha0.invoke(valueOf);
                                    C7458kA2 c7458kA29 = C7458kA2.a;
                                    i3 = 3;
                                }
                            } else {
                                ha0.invoke(valueOf);
                                C7458kA2 c7458kA210 = C7458kA2.a;
                            }
                            i += i3;
                        } else {
                            ha0.invoke(valueOf);
                            C7458kA2 c7458kA211 = C7458kA2.a;
                            i3 = 1;
                            i += i3;
                        }
                    }
                } else {
                    ha0.invoke(valueOf);
                    i++;
                }
            }
        }
    }

    @InterfaceC8046mW0(name = "size")
    @InterfaceC8289nW0
    public static final long i(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        return l(str, 0, 0, 3, null);
    }

    @InterfaceC8046mW0(name = "size")
    @InterfaceC8289nW0
    public static final long j(@NotNull String str, int i) {
        C6562gT0.p(str, "<this>");
        return l(str, i, 0, 2, null);
    }

    @InterfaceC8046mW0(name = "size")
    @InterfaceC8289nW0
    public static final long k(@NotNull String str, int i, int i2) {
        int i3;
        char c2;
        C6562gT0.p(str, "<this>");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    long j = 0;
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            j++;
                        } else {
                            if (charAt < 2048) {
                                i3 = 2;
                            } else if (charAt >= 55296 && charAt <= 57343) {
                                int i4 = i + 1;
                                if (i4 < i2) {
                                    c2 = str.charAt(i4);
                                } else {
                                    c2 = 0;
                                }
                                if (charAt <= 56319 && c2 >= 56320 && c2 <= 57343) {
                                    j += 4;
                                    i += 2;
                                } else {
                                    j++;
                                    i = i4;
                                }
                            } else {
                                i3 = 3;
                            }
                            j += i3;
                        }
                        i++;
                    }
                    return j;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    public static /* synthetic */ long l(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return k(str, i, i2);
    }
}
