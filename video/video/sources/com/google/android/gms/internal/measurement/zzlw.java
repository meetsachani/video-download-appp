package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzlw {
    public static String a(zzhm zzhmVar) {
        zzlv zzlvVar = new zzlv(zzhmVar);
        StringBuilder sb = new StringBuilder(zzlvVar.a());
        for (int i = 0; i < zzlvVar.a(); i++) {
            byte u = zzlvVar.u(i);
            if (u != 34) {
                if (u != 39) {
                    if (u != 92) {
                        switch (u) {
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
                                if (u >= 32 && u <= 126) {
                                    sb.append((char) u);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((u >>> 6) & 3) + 48));
                                    sb.append((char) (((u >>> 3) & 7) + 48));
                                    sb.append((char) ((u & 7) + 48));
                                    break;
                                }
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
