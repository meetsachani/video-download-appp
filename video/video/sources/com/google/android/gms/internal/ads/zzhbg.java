package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhbg {
    public static String a(zzgxk zzgxkVar) {
        StringBuilder sb = new StringBuilder(zzgxkVar.i());
        for (int i = 0; i < zzgxkVar.i(); i++) {
            byte e = zzgxkVar.e(i);
            if (e != 34) {
                if (e != 39) {
                    if (e != 92) {
                        switch (e) {
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
                                if (e >= 32 && e <= 126) {
                                    sb.append((char) e);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((e >>> 6) & 3) + 48));
                                    sb.append((char) (((e >>> 3) & 7) + 48));
                                    sb.append((char) ((e & 7) + 48));
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
}
