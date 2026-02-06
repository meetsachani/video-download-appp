package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.util.Pair;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C2638Cg0;
import o.C4128Rj1;
import o.C5137af1;
import o.C6793hQ0;
import o.C8206nB;
import o.I3;
import o.InterfaceC11300zs1;
import o.J8;
import o.UE;

@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public final class zzdh {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", C2638Cg0.W4, "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");
    public static final /* synthetic */ int d = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0153, code lost:
        if (r0.equals("11") != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair a(zzz zzzVar) {
        char c2;
        int i;
        int parseInt;
        int parseInt2;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer num;
        Integer num2 = 1024;
        int i6 = 4;
        String str = zzzVar.k;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (C4128Rj1.w.equals(zzzVar.f301o)) {
            if (split.length < 3) {
                zzdx.f("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                return null;
            }
            Matcher matcher = c.matcher(split[1]);
            if (!matcher.matches()) {
                zzdx.f("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                return null;
            }
            String group = matcher.group(1);
            if (group != null) {
                int hashCode = group.hashCode();
                if (hashCode != 1567) {
                    switch (hashCode) {
                        case I3.g /* 1536 */:
                            if (group.equals(ChipTextInputComboView.b.Y)) {
                                num = 1;
                                break;
                            }
                            break;
                        case 1537:
                            if (group.equals("01")) {
                                num = 2;
                                break;
                            }
                            break;
                        case 1538:
                            if (group.equals("02")) {
                                num = 4;
                                break;
                            }
                            break;
                        case 1539:
                            if (group.equals("03")) {
                                num = 8;
                                break;
                            }
                            break;
                        case 1540:
                            if (group.equals("04")) {
                                num = 16;
                                break;
                            }
                            break;
                        case 1541:
                            if (group.equals("05")) {
                                num = 32;
                                break;
                            }
                            break;
                        case 1542:
                            if (group.equals("06")) {
                                num = 64;
                                break;
                            }
                            break;
                        case 1543:
                            if (group.equals("07")) {
                                num = 128;
                                break;
                            }
                            break;
                        case 1544:
                            if (group.equals("08")) {
                                num = 256;
                                break;
                            }
                            break;
                        case 1545:
                            if (group.equals("09")) {
                                num = 512;
                                break;
                            }
                            break;
                    }
                    if (num == null) {
                        zzdx.f("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(group)));
                        return null;
                    }
                    String str2 = split[2];
                    if (str2 != null) {
                        int hashCode2 = str2.hashCode();
                        switch (hashCode2) {
                            case 1537:
                                if (str2.equals("01")) {
                                    num2 = 1;
                                    break;
                                }
                                break;
                            case 1538:
                                if (str2.equals("02")) {
                                    num2 = 2;
                                    break;
                                }
                                break;
                            case 1539:
                                if (str2.equals("03")) {
                                    num2 = 4;
                                    break;
                                }
                                break;
                            case 1540:
                                if (str2.equals("04")) {
                                    num2 = 8;
                                    break;
                                }
                                break;
                            case 1541:
                                if (str2.equals("05")) {
                                    num2 = 16;
                                    break;
                                }
                                break;
                            case 1542:
                                if (str2.equals("06")) {
                                    num2 = 32;
                                    break;
                                }
                                break;
                            case 1543:
                                if (str2.equals("07")) {
                                    num2 = 64;
                                    break;
                                }
                                break;
                            case 1544:
                                if (str2.equals("08")) {
                                    num2 = 128;
                                    break;
                                }
                                break;
                            case 1545:
                                if (str2.equals("09")) {
                                    num2 = 256;
                                    break;
                                }
                                break;
                            default:
                                switch (hashCode2) {
                                    case 1567:
                                        if (str2.equals("10")) {
                                            num2 = 512;
                                            break;
                                        }
                                        break;
                                    case 1569:
                                        if (str2.equals("12")) {
                                            num2 = 2048;
                                            break;
                                        }
                                        break;
                                    case 1570:
                                        if (str2.equals("13")) {
                                            num2 = 4096;
                                            break;
                                        }
                                        break;
                                }
                        }
                        if (num2 != null) {
                            zzdx.f("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str2)));
                            return null;
                        }
                        return new Pair(num, num2);
                    }
                    num2 = null;
                    if (num2 != null) {
                    }
                } else if (group.equals("10")) {
                    num = num2;
                    if (num == null) {
                    }
                }
            }
            num = null;
            if (num == null) {
            }
        } else {
            String str3 = split[0];
            switch (str3.hashCode()) {
                case 2986313:
                    if (str3.equals("ac-4")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3004662:
                    if (str3.equals(C5137af1.i)) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3006243:
                    if (str3.equals(C5137af1.d)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3006244:
                    if (str3.equals(C5137af1.e)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3199032:
                    if (str3.equals(C5137af1.g)) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3214780:
                    if (str3.equals(C5137af1.h)) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3356560:
                    if (str3.equals(C5137af1.j)) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3475740:
                    if (str3.equals("s263")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3624515:
                    if (str3.equals(C5137af1.f)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    String str4 = zzzVar.k;
                    Pair pair = new Pair(1, 1);
                    if (split.length < 3) {
                        zzdx.f("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str4)));
                    } else {
                        try {
                            return new Pair(Integer.valueOf(Integer.parseInt(split[1])), Integer.valueOf(Integer.parseInt(split[2])));
                        } catch (NumberFormatException unused) {
                            zzdx.f("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str4)));
                        }
                    }
                    return pair;
                case 1:
                case 2:
                    String str5 = zzzVar.k;
                    int length = split.length;
                    if (length < 2) {
                        zzdx.f("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str5)));
                        return null;
                    }
                    try {
                        if (split[1].length() == 6) {
                            i = 16;
                            parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                            parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                        } else {
                            i = 16;
                            if (length >= 3) {
                                parseInt = Integer.parseInt(split[1]);
                                parseInt2 = Integer.parseInt(split[2]);
                            } else {
                                zzdx.f("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str5);
                                return null;
                            }
                        }
                        int i7 = parseInt != 66 ? parseInt != 77 ? parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : i : 8 : 4 : 2 : 1;
                        if (i7 == -1) {
                            zzdx.f("CodecSpecificDataUtil", "Unknown AVC profile: " + parseInt);
                            return null;
                        }
                        switch (parseInt2) {
                            case 10:
                                i6 = 1;
                                break;
                            case 11:
                                break;
                            case 12:
                                i6 = 8;
                                break;
                            case 13:
                                i6 = i;
                                break;
                            default:
                                switch (parseInt2) {
                                    case 20:
                                        i6 = 32;
                                        break;
                                    case 21:
                                        i6 = 64;
                                        break;
                                    case 22:
                                        i6 = 128;
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 30:
                                                i6 = 256;
                                                break;
                                            case 31:
                                                i6 = 512;
                                                break;
                                            case 32:
                                                i6 = 1024;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case 40:
                                                        i6 = 2048;
                                                        break;
                                                    case 41:
                                                        i6 = 4096;
                                                        break;
                                                    case 42:
                                                        i6 = 8192;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case 50:
                                                                i6 = 16384;
                                                                break;
                                                            case 51:
                                                                i6 = 32768;
                                                                break;
                                                            case 52:
                                                                i6 = 65536;
                                                                break;
                                                            default:
                                                                i6 = -1;
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                        if (i6 == -1) {
                            zzdx.f("CodecSpecificDataUtil", "Unknown AVC level: " + parseInt2);
                            return null;
                        }
                        return new Pair(Integer.valueOf(i7), Integer.valueOf(i6));
                    } catch (NumberFormatException unused2) {
                        zzdx.f("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str5)));
                        return null;
                    }
                case 3:
                    String str6 = zzzVar.k;
                    if (split.length < 3) {
                        zzdx.f("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str6)));
                        return null;
                    }
                    try {
                        int parseInt3 = Integer.parseInt(split[1]);
                        int parseInt4 = Integer.parseInt(split[2]);
                        int i8 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                        if (i8 == -1) {
                            zzdx.f("CodecSpecificDataUtil", "Unknown VP9 profile: " + parseInt3);
                            return null;
                        }
                        if (parseInt4 == 10) {
                            i6 = 1;
                        } else if (parseInt4 == 11) {
                            i6 = 2;
                        } else if (parseInt4 != 20) {
                            if (parseInt4 == 21) {
                                i6 = 8;
                            } else if (parseInt4 == 30) {
                                i6 = 16;
                            } else if (parseInt4 == 31) {
                                i6 = 32;
                            } else if (parseInt4 == 40) {
                                i6 = 64;
                            } else if (parseInt4 == 41) {
                                i6 = 128;
                            } else if (parseInt4 == 50) {
                                i6 = 256;
                            } else if (parseInt4 != 51) {
                                switch (parseInt4) {
                                    case 60:
                                        i6 = 2048;
                                        break;
                                    case 61:
                                        i6 = 4096;
                                        break;
                                    case 62:
                                        i6 = 8192;
                                        break;
                                    default:
                                        i6 = -1;
                                        break;
                                }
                            } else {
                                i6 = 512;
                            }
                        }
                        if (i6 == -1) {
                            zzdx.f("CodecSpecificDataUtil", "Unknown VP9 level: " + parseInt4);
                            return null;
                        }
                        return new Pair(Integer.valueOf(i8), Integer.valueOf(i6));
                    } catch (NumberFormatException unused3) {
                        zzdx.f("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str6)));
                        return null;
                    }
                case 4:
                case 5:
                    return b(zzzVar.k, split, zzzVar.C);
                case 6:
                    String str7 = zzzVar.k;
                    zzk zzkVar = zzzVar.C;
                    if (split.length < 4) {
                        zzdx.f("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str7)));
                        return null;
                    }
                    try {
                        int parseInt5 = Integer.parseInt(split[1]);
                        int parseInt6 = Integer.parseInt(split[2].substring(0, 2));
                        int parseInt7 = Integer.parseInt(split[3]);
                        if (parseInt5 != 0) {
                            zzdx.f("CodecSpecificDataUtil", "Unknown AV1 profile: " + parseInt5);
                            return null;
                        }
                        if (parseInt7 == 8) {
                            i2 = 1;
                        } else if (parseInt7 != 10) {
                            zzdx.f("CodecSpecificDataUtil", "Unknown AV1 bit depth: " + parseInt7);
                            return null;
                        } else {
                            i2 = (zzkVar == null || !(zzkVar.d != null || (i3 = zzkVar.c) == 7 || i3 == 6)) ? 2 : 4096;
                        }
                        switch (parseInt6) {
                            case 0:
                                i6 = 1;
                                break;
                            case 1:
                                i6 = 2;
                                break;
                            case 2:
                                break;
                            case 3:
                                i6 = 8;
                                break;
                            case 4:
                                i6 = 16;
                                break;
                            case 5:
                                i6 = 32;
                                break;
                            case 6:
                                i6 = 64;
                                break;
                            case 7:
                                i6 = 128;
                                break;
                            case 8:
                                i6 = 256;
                                break;
                            case 9:
                                i6 = 512;
                                break;
                            case 10:
                                i6 = 1024;
                                break;
                            case 11:
                                i6 = 2048;
                                break;
                            case 12:
                                i6 = 4096;
                                break;
                            case 13:
                                i6 = 8192;
                                break;
                            case 14:
                                i6 = 16384;
                                break;
                            case 15:
                                i6 = 32768;
                                break;
                            case 16:
                                i6 = 65536;
                                break;
                            case 17:
                                i6 = 131072;
                                break;
                            case 18:
                                i6 = 262144;
                                break;
                            case 19:
                                i6 = 524288;
                                break;
                            case 20:
                                i6 = 1048576;
                                break;
                            case 21:
                                i6 = 2097152;
                                break;
                            case 22:
                                i6 = 4194304;
                                break;
                            case 23:
                                i6 = 8388608;
                                break;
                            default:
                                i6 = -1;
                                break;
                        }
                        if (i6 == -1) {
                            zzdx.f("CodecSpecificDataUtil", "Unknown AV1 level: " + parseInt6);
                            return null;
                        }
                        return new Pair(Integer.valueOf(i2), Integer.valueOf(i6));
                    } catch (NumberFormatException unused4) {
                        zzdx.f("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str7)));
                        return null;
                    }
                case 7:
                    String str8 = zzzVar.k;
                    if (split.length != 3) {
                        zzdx.f("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str8)));
                        return null;
                    }
                    try {
                        if ("audio/mp4a-latm".equals(zzay.d(Integer.parseInt(split[1], 16)))) {
                            int parseInt8 = Integer.parseInt(split[2]);
                            if (parseInt8 == 17) {
                                i6 = 17;
                            } else if (parseInt8 == 20) {
                                i6 = 20;
                            } else if (parseInt8 == 23) {
                                i6 = 23;
                            } else if (parseInt8 == 29) {
                                i6 = 29;
                            } else if (parseInt8 == 39) {
                                i6 = 39;
                            } else if (parseInt8 != 42) {
                                switch (parseInt8) {
                                    case 1:
                                        i6 = 1;
                                        break;
                                    case 2:
                                        i6 = 2;
                                        break;
                                    case 3:
                                        i6 = 3;
                                        break;
                                    case 4:
                                        break;
                                    case 5:
                                        i6 = 5;
                                        break;
                                    case 6:
                                        i6 = 6;
                                        break;
                                    default:
                                        i6 = -1;
                                        break;
                                }
                            } else {
                                i6 = 42;
                            }
                            if (i6 != -1) {
                                return new Pair(Integer.valueOf(i6), 0);
                            }
                        }
                        return null;
                    } catch (NumberFormatException unused5) {
                        zzdx.f("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str8)));
                        return null;
                    }
                case '\b':
                    if (split.length != 4) {
                        zzdx.f("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(str));
                        return null;
                    }
                    try {
                        int parseInt9 = Integer.parseInt(split[1]);
                        int parseInt10 = Integer.parseInt(split[2]);
                        int parseInt11 = Integer.parseInt(split[3]);
                        if (parseInt9 == 0) {
                            if (parseInt10 == 0) {
                                i4 = 257;
                                int i9 = i4;
                                parseInt10 = 0;
                                i5 = i9;
                            }
                            i5 = -1;
                        } else if (parseInt9 != 1) {
                            if (parseInt9 == 2) {
                                if (parseInt10 == 1) {
                                    i5 = J8.f0;
                                    parseInt10 = 1;
                                } else if (parseInt10 == 2) {
                                    i5 = J8.h0;
                                    parseInt10 = 2;
                                }
                            }
                            i5 = -1;
                        } else if (parseInt10 == 0) {
                            i4 = C6793hQ0.j;
                            int i92 = i4;
                            parseInt10 = 0;
                            i5 = i92;
                        } else {
                            if (parseInt10 == 1) {
                                i5 = 514;
                                parseInt10 = 1;
                            }
                            i5 = -1;
                        }
                        if (i5 == -1) {
                            zzdx.f("CodecSpecificDataUtil", "Unknown AC-4 profile: " + parseInt9 + UE.h + parseInt10);
                            return null;
                        }
                        int i10 = parseInt11 != 0 ? parseInt11 != 1 ? parseInt11 != 2 ? parseInt11 != 3 ? parseInt11 != 4 ? -1 : 16 : 8 : 4 : 2 : 1;
                        if (i10 == -1) {
                            zzdx.f("CodecSpecificDataUtil", "Unknown AC-4 level: " + parseInt11);
                            return null;
                        }
                        return new Pair(Integer.valueOf(i5), Integer.valueOf(i10));
                    } catch (NumberFormatException unused6) {
                        zzdx.f("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(str));
                        return null;
                    }
                default:
                    return null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
        if (r11.equals("L123") != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0260  */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair b(String str, String[] strArr, @InterfaceC11300zs1 zzk zzkVar) {
        int i;
        Integer num;
        if (strArr.length < 4) {
            zzdx.f("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = c.matcher(strArr[1]);
        if (!matcher.matches()) {
            zzdx.f("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String group = matcher.group(1);
        char c2 = 6;
        if ("1".equals(group)) {
            i = 1;
        } else if (C2638Cg0.Y4.equals(group)) {
            if (zzkVar != null && zzkVar.c == 6) {
                i = 4096;
            } else {
                i = 2;
            }
        } else if ("6".equals(group)) {
            i = 6;
        } else {
            zzdx.f("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(String.valueOf(group)));
            return null;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        c2 = C8206nB.d;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 74758:
                    if (str2.equals("L60")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        c2 = 20;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        c2 = 21;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        c2 = 22;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        c2 = 23;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        c2 = 24;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        c2 = 25;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312806:
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    num = 1;
                    break;
                case 1:
                    num = 4;
                    break;
                case 2:
                    num = 16;
                    break;
                case 3:
                    num = 64;
                    break;
                case 4:
                    num = 256;
                    break;
                case 5:
                    num = 1024;
                    break;
                case 6:
                    num = 4096;
                    break;
                case 7:
                    num = 16384;
                    break;
                case '\b':
                    num = 65536;
                    break;
                case '\t':
                    num = 262144;
                    break;
                case '\n':
                    num = 1048576;
                    break;
                case 11:
                    num = 4194304;
                    break;
                case '\f':
                    num = 16777216;
                    break;
                case '\r':
                    num = 2;
                    break;
                case 14:
                    num = 8;
                    break;
                case 15:
                    num = 32;
                    break;
                case 16:
                    num = 128;
                    break;
                case 17:
                    num = 512;
                    break;
                case 18:
                    num = 2048;
                    break;
                case 19:
                    num = 8192;
                    break;
                case 20:
                    num = 32768;
                    break;
                case 21:
                    num = 131072;
                    break;
                case 22:
                    num = 524288;
                    break;
                case 23:
                    num = 2097152;
                    break;
                case 24:
                    num = 8388608;
                    break;
                case 25:
                    num = 33554432;
                    break;
            }
            if (num != null) {
                zzdx.f("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(String.valueOf(str2)));
                return null;
            }
            return new Pair(Integer.valueOf(i), num);
        }
        num = null;
        if (num != null) {
        }
    }

    public static String c(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String d(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        char c2;
        int i5;
        String str = b[i];
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        if (true != z) {
            c2 = 'L';
        } else {
            c2 = 'H';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c2), Integer.valueOf(i4)};
        String str2 = zzeu.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i6 = 6;
        while (true) {
            if (i6 <= 0) {
                break;
            }
            int i7 = i6 - 1;
            if (iArr[i7] != 0) {
                break;
            }
            i6 = i7;
        }
        for (i5 = 0; i5 < i6; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static byte[] e(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }
}
