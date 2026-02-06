package o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class JH0 {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int[][] i;
    public static final int[][] j;
    public final byte[] a;
    public static final String[] b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    public static final int[][] h = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* loaded from: classes3.dex */
    public class a implements Comparator<C8555oc2> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C8555oc2 c8555oc2, C8555oc2 c8555oc22) {
            return c8555oc2.d() - c8555oc22.d();
        }
    }

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance(cls, 5, 256);
        i = iArr;
        iArr[0][32] = 1;
        for (int i2 = 65; i2 <= 90; i2++) {
            i[0][i2] = i2 - 63;
        }
        i[1][32] = 1;
        for (int i3 = 97; i3 <= 122; i3++) {
            i[1][i3] = i3 - 95;
        }
        i[2][32] = 1;
        for (int i4 = 48; i4 <= 57; i4++) {
            i[2][i4] = i4 - 46;
        }
        int[] iArr2 = i[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i5 = 0; i5 < 28; i5++) {
            i[3][iArr3[i5]] = i5;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i6 = 0; i6 < 31; i6++) {
            int i7 = iArr4[i6];
            if (i7 > 0) {
                i[4][i7] = i6;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(cls, 6, 6);
        j = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = j;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public JH0(byte[] bArr) {
        this.a = bArr;
    }

    public static Collection<C8555oc2> b(Iterable<C8555oc2> iterable) {
        LinkedList linkedList = new LinkedList();
        for (C8555oc2 c8555oc2 : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (it.hasNext()) {
                    C8555oc2 c8555oc22 = (C8555oc2) it.next();
                    if (c8555oc22.g(c8555oc2)) {
                        break;
                    } else if (c8555oc2.g(c8555oc22)) {
                        it.remove();
                    }
                } else {
                    linkedList.add(c8555oc2);
                    break;
                }
            }
        }
        return linkedList;
    }

    public static void d(C8555oc2 c8555oc2, int i2, int i3, Collection<C8555oc2> collection) {
        C8555oc2 b2 = c8555oc2.b(i2);
        collection.add(b2.h(4, i3));
        if (c8555oc2.e() != 4) {
            collection.add(b2.i(4, i3));
        }
        if (i3 == 3 || i3 == 4) {
            collection.add(b2.h(2, 16 - i3).h(2, 1));
        }
        if (c8555oc2.c() > 0) {
            collection.add(c8555oc2.a(i2).a(i2 + 1));
        }
    }

    public static Collection<C8555oc2> f(Iterable<C8555oc2> iterable, int i2, int i3) {
        LinkedList linkedList = new LinkedList();
        for (C8555oc2 c8555oc2 : iterable) {
            d(c8555oc2, i2, i3, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C10792xn a() {
        byte b2;
        int i2;
        Collection<C8555oc2> singletonList = Collections.singletonList(C8555oc2.e);
        int i3 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i3 < bArr.length) {
                int i4 = i3 + 1;
                if (i4 < bArr.length) {
                    b2 = bArr[i4];
                } else {
                    b2 = 0;
                }
                byte b3 = bArr[i3];
                if (b3 != 13) {
                    if (b3 != 44) {
                        if (b3 != 46) {
                            if (b3 == 58 && b2 == 32) {
                                i2 = 5;
                                if (i2 <= 0) {
                                    singletonList = f(singletonList, i3, i2);
                                    i3 = i4;
                                } else {
                                    singletonList = e(singletonList, i3);
                                }
                                i3++;
                            }
                            i2 = 0;
                            if (i2 <= 0) {
                            }
                            i3++;
                        } else {
                            if (b2 == 32) {
                                i2 = 3;
                                if (i2 <= 0) {
                                }
                                i3++;
                            }
                            i2 = 0;
                            if (i2 <= 0) {
                            }
                            i3++;
                        }
                    } else {
                        if (b2 == 32) {
                            i2 = 4;
                            if (i2 <= 0) {
                            }
                            i3++;
                        }
                        i2 = 0;
                        if (i2 <= 0) {
                        }
                        i3++;
                    }
                } else {
                    if (b2 == 10) {
                        i2 = 2;
                        if (i2 <= 0) {
                        }
                        i3++;
                    }
                    i2 = 0;
                    if (i2 <= 0) {
                    }
                    i3++;
                }
            } else {
                return ((C8555oc2) Collections.min(singletonList, new a())).j(this.a);
            }
        }
    }

    public final void c(C8555oc2 c8555oc2, int i2, Collection<C8555oc2> collection) {
        boolean z;
        char c2 = (char) (this.a[i2] & 255);
        if (i[c8555oc2.e()][c2] > 0) {
            z = true;
        } else {
            z = false;
        }
        C8555oc2 c8555oc22 = null;
        for (int i3 = 0; i3 <= 4; i3++) {
            int i4 = i[i3][c2];
            if (i4 > 0) {
                if (c8555oc22 == null) {
                    c8555oc22 = c8555oc2.b(i2);
                }
                if (!z || i3 == c8555oc2.e() || i3 == 2) {
                    collection.add(c8555oc22.h(i3, i4));
                }
                if (!z && j[c8555oc2.e()][i3] >= 0) {
                    collection.add(c8555oc22.i(i3, i4));
                }
            }
        }
        if (c8555oc2.c() <= 0 && i[c8555oc2.e()][c2] != 0) {
            return;
        }
        collection.add(c8555oc2.a(i2));
    }

    public final Collection<C8555oc2> e(Iterable<C8555oc2> iterable, int i2) {
        LinkedList linkedList = new LinkedList();
        for (C8555oc2 c8555oc2 : iterable) {
            c(c8555oc2, i2, linkedList);
        }
        return b(linkedList);
    }
}
