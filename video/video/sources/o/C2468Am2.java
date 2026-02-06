package o;

import o.AbstractC4253Sp2;

/* renamed from: o.Am2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2468Am2 {

    /* renamed from: o.Am2$a */
    /* loaded from: classes.dex */
    public static class a implements c {
        public final /* synthetic */ AbstractC8616os a;

        public a(AbstractC8616os abstractC8616os) {
            this.a = abstractC8616os;
        }

        @Override // o.C2468Am2.c
        public byte a(int i) {
            return this.a.i(i);
        }

        @Override // o.C2468Am2.c
        public int size() {
            return this.a.size();
        }
    }

    /* renamed from: o.Am2$b */
    /* loaded from: classes.dex */
    public static class b implements c {
        public final /* synthetic */ byte[] a;

        public b(byte[] bArr) {
            this.a = bArr;
        }

        @Override // o.C2468Am2.c
        public byte a(int i) {
            return this.a[i];
        }

        @Override // o.C2468Am2.c
        public int size() {
            return this.a.length;
        }
    }

    /* renamed from: o.Am2$c */
    /* loaded from: classes.dex */
    public interface c {
        byte a(int i);

        int size();
    }

    public static String a(AbstractC8616os abstractC8616os) {
        return b(new a(abstractC8616os));
    }

    public static String b(c cVar) {
        StringBuilder sb = new StringBuilder(cVar.size());
        for (int i = 0; i < cVar.size(); i++) {
            byte a2 = cVar.a(i);
            if (a2 != 34) {
                if (a2 != 39) {
                    if (a2 != 92) {
                        switch (a2) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (a2 >= 32 && a2 <= 126) {
                                    sb.append((char) a2);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((a2 >>> 6) & 3) + 48));
                                    sb.append((char) (((a2 >>> 3) & 7) + 48));
                                    sb.append((char) ((a2 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static String c(byte[] bArr) {
        return b(new b(bArr));
    }

    public static String d(String str) {
        return str.replace(C11298zs.h, "\\\\").replace(AbstractC4253Sp2.b.x1, "\\\"");
    }

    public static String e(String str) {
        return a(AbstractC8616os.H(str));
    }
}
