package com.google.android.gms.internal.ads;

import android.text.Layout;
import com.facebook.appevents.Q;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10323vs;
import o.C10901yE;
import o.C4500Ve2;
import o.C5202av2;
import o.C5445bv2;
import o.InterfaceC11300zs1;
import o.UE;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public final class zzall implements zzakl {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    public static final zzalj i = new zzalj(30.0f, 1, 1);
    public final XmlPullParserFactory a;

    public zzall() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
        if (r13.equals("s") != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long c(String str, zzalj zzaljVar) throws zzakh {
        double d2;
        double d3;
        String group;
        String group2;
        double d4;
        double d5;
        String group3;
        Matcher matcher = b.matcher(str);
        char c2 = 2;
        if (matcher.matches()) {
            matcher.group(1).getClass();
            matcher.group(2).getClass();
            String group4 = matcher.group(3);
            group4.getClass();
            double parseLong = (Long.parseLong(group) * 3600) + (Long.parseLong(group2) * 60);
            double parseLong2 = Long.parseLong(group4);
            String group5 = matcher.group(4);
            double d6 = 0.0d;
            if (group5 != null) {
                d4 = Double.parseDouble(group5);
            } else {
                d4 = 0.0d;
            }
            double d7 = parseLong + parseLong2;
            String group6 = matcher.group(5);
            if (group6 != null) {
                d5 = ((float) Long.parseLong(group6)) / zzaljVar.a;
            } else {
                d5 = 0.0d;
            }
            double d8 = d7 + d4;
            if (matcher.group(6) != null) {
                d6 = (Long.parseLong(group3) / zzaljVar.b) / zzaljVar.a;
            }
            return (long) ((d8 + d5 + d6) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (matcher2.matches()) {
            String group7 = matcher2.group(1);
            group7.getClass();
            double parseDouble = Double.parseDouble(group7);
            String group8 = matcher2.group(2);
            group8.getClass();
            int hashCode = group8.hashCode();
            if (hashCode != 102) {
                if (hashCode != 104) {
                    if (hashCode != 109) {
                        if (hashCode != 3494) {
                            if (hashCode != 115) {
                                if (hashCode == 116 && group8.equals("t")) {
                                    c2 = 5;
                                }
                                c2 = 65535;
                            }
                        } else {
                            if (group8.equals("ms")) {
                                c2 = 3;
                            }
                            c2 = 65535;
                        }
                    } else {
                        if (group8.equals("m")) {
                            c2 = 1;
                        }
                        c2 = 65535;
                    }
                } else {
                    if (group8.equals(C10901yE.i)) {
                        c2 = 0;
                    }
                    c2 = 65535;
                }
            } else {
                if (group8.equals("f")) {
                    c2 = 4;
                }
                c2 = 65535;
            }
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 != 3) {
                        if (c2 != 4) {
                            if (c2 == 5) {
                                d3 = zzaljVar.c;
                            }
                            return (long) (parseDouble * 1000000.0d);
                        }
                        d3 = zzaljVar.a;
                    } else {
                        d3 = 1000.0d;
                    }
                    parseDouble /= d3;
                    return (long) (parseDouble * 1000000.0d);
                }
                d2 = 60.0d;
            } else {
                d2 = 3600.0d;
            }
            parseDouble *= d2;
            return (long) (parseDouble * 1000000.0d);
        }
        throw new zzakh("Malformed time expression: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @InterfaceC11300zs1
    public static Layout.Alignment d(String str) {
        char c2;
        String a = zzfui.a(str);
        switch (a.hashCode()) {
            case -1364013995:
                if (a.equals(C5445bv2.m0)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 100571:
                if (a.equals("end")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3317767:
                if (a.equals("left")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 108511772:
                if (a.equals(C5445bv2.n0)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 109757538:
                if (a.equals("start")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 != 0 && c2 != 1) {
            if (c2 != 2 && c2 != 3) {
                if (c2 != 4) {
                    return null;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    public static zzalo e(@InterfaceC11300zs1 zzalo zzaloVar) {
        return zzaloVar == null ? new zzalo() : zzaloVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static zzalo f(XmlPullParser xmlPullParser, zzalo zzaloVar) {
        ?? r6;
        Matcher matcher;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z = false;
        zzalo zzaloVar2 = zzaloVar;
        int i2 = 0;
        while (i2 < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            String attributeName = xmlPullParser.getAttributeName(i2);
            ?? r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            ?? r102 = -1;
            r10 = -1;
            r10 = -1;
            ?? r103 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            ?? r104 = -1;
            r10 = -1;
            r10 = -1;
            ?? r105 = -1;
            r10 = -1;
            r10 = -1;
            r10 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals(C5445bv2.I)) {
                        r6 = 6;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1289044182:
                    if (attributeName.equals(C5445bv2.F)) {
                        r6 = 16;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1224696685:
                    if (attributeName.equals(C5445bv2.K)) {
                        r6 = 3;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1065511464:
                    if (attributeName.equals(C5445bv2.Q)) {
                        r6 = 7;
                        break;
                    }
                    r6 = -1;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        r6 = 15;
                        break;
                    }
                    r6 = -1;
                    break;
                case -879295043:
                    if (attributeName.equals(C5445bv2.P)) {
                        r6 = 12;
                        break;
                    }
                    r6 = -1;
                    break;
                case -734428249:
                    if (attributeName.equals(C5445bv2.L)) {
                        r6 = 5;
                        break;
                    }
                    r6 = -1;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        r6 = z;
                        break;
                    }
                    r6 = -1;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        r6 = 10;
                        break;
                    }
                    r6 = -1;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        r6 = 2;
                        break;
                    }
                    r6 = -1;
                    break;
                case 109403361:
                    if (attributeName.equals(C5445bv2.U)) {
                        r6 = 14;
                        break;
                    }
                    r6 = -1;
                    break;
                case 110138194:
                    if (attributeName.equals(C5445bv2.R)) {
                        r6 = 9;
                        break;
                    }
                    r6 = -1;
                    break;
                case 365601008:
                    if (attributeName.equals(C5445bv2.J)) {
                        r6 = 4;
                        break;
                    }
                    r6 = -1;
                    break;
                case 921125321:
                    if (attributeName.equals(C5445bv2.S)) {
                        r6 = 13;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1115953443:
                    if (attributeName.equals(C5445bv2.O)) {
                        r6 = 11;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1287124693:
                    if (attributeName.equals(C5445bv2.H)) {
                        r6 = 1;
                        break;
                    }
                    r6 = -1;
                    break;
                case 1754920356:
                    if (attributeName.equals(C5445bv2.V)) {
                        r6 = 8;
                        break;
                    }
                    r6 = -1;
                    break;
                default:
                    r6 = -1;
                    break;
            }
            switch (r6) {
                case 0:
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        zzaloVar2 = e(zzaloVar2);
                        zzaloVar2.H(attributeValue);
                        break;
                    }
                case 1:
                    zzaloVar2 = e(zzaloVar2);
                    try {
                        zzaloVar2.A(zzdi.b(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzdx.f("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 2:
                    zzaloVar2 = e(zzaloVar2);
                    try {
                        zzaloVar2.D(zzdi.b(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        zzdx.f("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 3:
                    zzaloVar2 = e(zzaloVar2);
                    zzaloVar2.E(attributeValue);
                    break;
                case 4:
                    try {
                        zzaloVar2 = e(zzaloVar2);
                        String str = zzeu.a;
                        String[] split = attributeValue.split("\\s+", -1);
                        int length = split.length;
                        if (length == 1) {
                            matcher = d.matcher(attributeValue);
                        } else if (length == 2) {
                            matcher = d.matcher(split[1]);
                            zzdx.f("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        } else {
                            throw new zzakh("Invalid number of entries for fontSize: " + length + UE.h);
                        }
                        if (matcher.matches()) {
                            String group = matcher.group(3);
                            if (group != null) {
                                int hashCode = group.hashCode();
                                if (hashCode != 37) {
                                    if (hashCode != 3240) {
                                        if (hashCode == 3592 && group.equals("px")) {
                                            r10 = 0;
                                        }
                                    } else if (group.equals(Q.k)) {
                                        r10 = 1;
                                    }
                                } else if (group.equals("%")) {
                                    r10 = 2;
                                }
                                if (r10 != 0) {
                                    if (r10 != 1) {
                                        if (r10 == 2) {
                                            zzaloVar2.G(3);
                                        } else {
                                            throw new zzakh("Invalid unit for fontSize: '" + group + "'.");
                                        }
                                    } else {
                                        zzaloVar2.G(2);
                                    }
                                } else {
                                    zzaloVar2.G(1);
                                }
                                String group2 = matcher.group(1);
                                if (group2 != null) {
                                    zzaloVar2.F(Float.parseFloat(group2));
                                    break;
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw new zzakh("Invalid expression for fontSize: '" + attributeValue + "'.");
                        }
                    } catch (zzakh unused3) {
                        zzdx.f("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        break;
                    }
                case 5:
                    zzaloVar2 = e(zzaloVar2);
                    zzaloVar2.B("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzaloVar2 = e(zzaloVar2);
                    zzaloVar2.I("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzaloVar2 = e(zzaloVar2);
                    zzaloVar2.b(d(attributeValue));
                    break;
                case 8:
                    zzaloVar2 = e(zzaloVar2);
                    zzaloVar2.K(d(attributeValue));
                    break;
                case 9:
                    String a = zzfui.a(attributeValue);
                    int hashCode2 = a.hashCode();
                    if (hashCode2 != 96673) {
                        if (hashCode2 == 3387192 && a.equals("none")) {
                            r105 = z;
                        }
                    } else if (a.equals("all")) {
                        r105 = 1;
                    }
                    if (r105 != 0) {
                        if (r105 == 1) {
                            zzaloVar2 = e(zzaloVar2);
                            zzaloVar2.c(true);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        zzaloVar2 = e(zzaloVar2);
                        zzaloVar2.c(z);
                        break;
                    }
                case 10:
                    String a2 = zzfui.a(attributeValue);
                    switch (a2.hashCode()) {
                        case -618561360:
                            if (a2.equals(C5445bv2.Y)) {
                                r104 = 2;
                                break;
                            }
                            break;
                        case -410956671:
                            if (a2.equals(C5445bv2.W)) {
                                r104 = z;
                                break;
                            }
                            break;
                        case -250518009:
                            if (a2.equals(C5445bv2.b0)) {
                                r104 = 5;
                                break;
                            }
                            break;
                        case -136074796:
                            if (a2.equals(C5445bv2.a0)) {
                                r104 = 4;
                                break;
                            }
                            break;
                        case 3016401:
                            if (a2.equals(C5445bv2.X)) {
                                r104 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (a2.equals("text")) {
                                r104 = 3;
                                break;
                            }
                            break;
                    }
                    if (r104 != 0) {
                        if (r104 != 1 && r104 != 2) {
                            if (r104 != 3 && r104 != 4) {
                                if (r104 == 5) {
                                    zzaloVar2 = e(zzaloVar2);
                                    zzaloVar2.N(4);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                zzaloVar2 = e(zzaloVar2);
                                zzaloVar2.N(3);
                                break;
                            }
                        } else {
                            zzaloVar2 = e(zzaloVar2);
                            zzaloVar2.N(2);
                            break;
                        }
                    } else {
                        zzaloVar2 = e(zzaloVar2);
                        zzaloVar2.N(1);
                        break;
                    }
                case 11:
                    String a3 = zzfui.a(attributeValue);
                    int hashCode3 = a3.hashCode();
                    if (hashCode3 != -1392885889) {
                        if (hashCode3 == 92734940 && a3.equals(C5445bv2.d0)) {
                            r103 = 1;
                        }
                    } else if (a3.equals(C5445bv2.c0)) {
                        r103 = z;
                    }
                    if (r103 != 0) {
                        if (r103 == 1) {
                            zzaloVar2 = e(zzaloVar2);
                            zzaloVar2.M(2);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        zzaloVar2 = e(zzaloVar2);
                        zzaloVar2.M(1);
                        break;
                    }
                    break;
                case 12:
                    String a4 = zzfui.a(attributeValue);
                    switch (a4.hashCode()) {
                        case -1461280213:
                            if (a4.equals(C5445bv2.i0)) {
                                r102 = 3;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (a4.equals("underline")) {
                                r102 = 2;
                                break;
                            }
                            break;
                        case 913457136:
                            if (a4.equals(C5445bv2.g0)) {
                                r102 = 1;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (a4.equals(C5445bv2.f0)) {
                                r102 = z;
                                break;
                            }
                            break;
                    }
                    if (r102 != 0) {
                        if (r102 != 1) {
                            if (r102 != 2) {
                                if (r102 == 3) {
                                    zzaloVar2 = e(zzaloVar2);
                                    zzaloVar2.e(z);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                zzaloVar2 = e(zzaloVar2);
                                zzaloVar2.e(true);
                                break;
                            }
                        } else {
                            zzaloVar2 = e(zzaloVar2);
                            zzaloVar2.J(z);
                            break;
                        }
                    } else {
                        zzaloVar2 = e(zzaloVar2);
                        zzaloVar2.J(true);
                        break;
                    }
                case 13:
                    zzaloVar2 = e(zzaloVar2);
                    zzaloVar2.d(zzalh.a(attributeValue));
                    break;
                case 14:
                    zzalo e2 = e(zzaloVar2);
                    Matcher matcher2 = e.matcher(attributeValue);
                    float f2 = Float.MAX_VALUE;
                    if (!matcher2.matches()) {
                        zzdx.f("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    } else {
                        try {
                            String group3 = matcher2.group(1);
                            if (group3 != null) {
                                f2 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group3)));
                            } else {
                                throw null;
                                break;
                            }
                        } catch (NumberFormatException e3) {
                            zzdx.g("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e3);
                        }
                    }
                    e2.a(f2);
                    zzaloVar2 = e2;
                    break;
                case 15:
                    zzaloVar2 = e(zzaloVar2);
                    zzaloVar2.L(attributeValue);
                    break;
                case 16:
                    zzaloVar2 = e(zzaloVar2);
                    zzaloVar2.C(attributeValue);
                    break;
            }
            i2++;
            z = false;
        }
        return zzaloVar2;
    }

    public static String[] g(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzeu.a;
        return trim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void a(byte[] bArr, int i2, int i3, zzakk zzakkVar, zzdk zzdkVar) {
        zzakf.a(b(bArr, i2, i3), zzakkVar, zzdkVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(12:394|(1:(10:397|398|399|400|401|402|35|(2:366|(1:368)(4:369|370|371|(2:373|(2:375|38)(2:376|377))(2:378|379)))|37|38)(1:408))(1:410)|409|398|399|400|401|402|35|(0)|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0168, code lost:
        r27 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017f, code lost:
        com.google.android.gms.internal.ads.zzdx.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0285 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, LOOP:1: B:126:0x0285->B:281:0x052f, LOOP_START, PHI: r1 r15 
      PHI: (r1v18 java.lang.String) = (r1v9 java.lang.String), (r1v39 java.lang.String) binds: [B:125:0x0283, B:281:0x052f] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r15v10 com.google.android.gms.internal.ads.zzalj) = (r15v7 com.google.android.gms.internal.ads.zzalj), (r15v31 com.google.android.gms.internal.ads.zzalj) binds: [B:125:0x0283, B:281:0x052f] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x008c, XmlPullParserException -> 0x008f, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007f, B:16:0x0087, B:22:0x0094, B:25:0x00a0, B:29:0x00b4, B:31:0x00cd, B:33:0x00d9, B:34:0x00dd, B:36:0x00e9, B:37:0x00ed, B:72:0x0188, B:91:0x01e5, B:94:0x01f3, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0227, B:110:0x022f, B:112:0x0237, B:114:0x023d, B:116:0x0243, B:118:0x024b, B:120:0x0253, B:123:0x025c, B:410:0x06e6, B:124:0x027f, B:126:0x0285, B:128:0x028e, B:130:0x029d, B:132:0x02a8, B:134:0x02bc, B:136:0x02c2, B:278:0x0523, B:138:0x02c9, B:140:0x02d1, B:142:0x02d7, B:144:0x02e2, B:146:0x02ea, B:147:0x02f1, B:150:0x02f8, B:277:0x051e, B:153:0x0306, B:155:0x030e, B:157:0x0314, B:159:0x031c, B:161:0x0322, B:164:0x0337, B:166:0x033d, B:168:0x034a, B:189:0x03b1, B:191:0x03b7, B:193:0x03bd, B:195:0x03c5, B:197:0x03cb, B:200:0x03e0, B:202:0x03e6, B:204:0x03f3, B:225:0x0472, B:227:0x047a, B:247:0x04c0, B:249:0x04c8, B:275:0x0511, B:205:0x03ff, B:206:0x0400, B:207:0x0401, B:209:0x0412, B:212:0x041a, B:215:0x0429, B:217:0x042f, B:219:0x043a, B:220:0x044e, B:221:0x044f, B:222:0x0450, B:223:0x045e, B:170:0x0353, B:171:0x0354, B:172:0x0355, B:173:0x035f, B:176:0x0369, B:179:0x0374, B:181:0x037a, B:183:0x0385, B:184:0x0394, B:185:0x0395, B:186:0x0396, B:187:0x03a1, B:283:0x0537, B:286:0x055a, B:342:0x0605, B:320:0x05bc, B:323:0x05c5, B:385:0x0681, B:330:0x05d8, B:333:0x05e2, B:337:0x05f0, B:340:0x05f7, B:341:0x05fe, B:347:0x061a, B:351:0x0626, B:355:0x062f, B:363:0x0641, B:372:0x0659, B:374:0x0665, B:376:0x066a, B:367:0x064a, B:75:0x0191, B:77:0x019d, B:80:0x01a8, B:82:0x01ae, B:84:0x01b9, B:85:0x01c5, B:86:0x01c6, B:87:0x01c7, B:42:0x0109, B:45:0x0119, B:48:0x0123, B:50:0x0129, B:52:0x0130, B:54:0x0136, B:61:0x014b, B:63:0x0152, B:71:0x017f, B:67:0x0172, B:70:0x017e, B:390:0x069e, B:392:0x06ab, B:395:0x06af, B:397:0x06b9, B:399:0x06c3, B:403:0x06cb, B:401:0x06c8, B:406:0x06dd, B:409:0x06e3, B:415:0x06ff), top: B:446:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04c8 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TRY_LEAVE, TryCatch #17 {IOException -> 0x008c, XmlPullParserException -> 0x008f, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007f, B:16:0x0087, B:22:0x0094, B:25:0x00a0, B:29:0x00b4, B:31:0x00cd, B:33:0x00d9, B:34:0x00dd, B:36:0x00e9, B:37:0x00ed, B:72:0x0188, B:91:0x01e5, B:94:0x01f3, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0227, B:110:0x022f, B:112:0x0237, B:114:0x023d, B:116:0x0243, B:118:0x024b, B:120:0x0253, B:123:0x025c, B:410:0x06e6, B:124:0x027f, B:126:0x0285, B:128:0x028e, B:130:0x029d, B:132:0x02a8, B:134:0x02bc, B:136:0x02c2, B:278:0x0523, B:138:0x02c9, B:140:0x02d1, B:142:0x02d7, B:144:0x02e2, B:146:0x02ea, B:147:0x02f1, B:150:0x02f8, B:277:0x051e, B:153:0x0306, B:155:0x030e, B:157:0x0314, B:159:0x031c, B:161:0x0322, B:164:0x0337, B:166:0x033d, B:168:0x034a, B:189:0x03b1, B:191:0x03b7, B:193:0x03bd, B:195:0x03c5, B:197:0x03cb, B:200:0x03e0, B:202:0x03e6, B:204:0x03f3, B:225:0x0472, B:227:0x047a, B:247:0x04c0, B:249:0x04c8, B:275:0x0511, B:205:0x03ff, B:206:0x0400, B:207:0x0401, B:209:0x0412, B:212:0x041a, B:215:0x0429, B:217:0x042f, B:219:0x043a, B:220:0x044e, B:221:0x044f, B:222:0x0450, B:223:0x045e, B:170:0x0353, B:171:0x0354, B:172:0x0355, B:173:0x035f, B:176:0x0369, B:179:0x0374, B:181:0x037a, B:183:0x0385, B:184:0x0394, B:185:0x0395, B:186:0x0396, B:187:0x03a1, B:283:0x0537, B:286:0x055a, B:342:0x0605, B:320:0x05bc, B:323:0x05c5, B:385:0x0681, B:330:0x05d8, B:333:0x05e2, B:337:0x05f0, B:340:0x05f7, B:341:0x05fe, B:347:0x061a, B:351:0x0626, B:355:0x062f, B:363:0x0641, B:372:0x0659, B:374:0x0665, B:376:0x066a, B:367:0x064a, B:75:0x0191, B:77:0x019d, B:80:0x01a8, B:82:0x01ae, B:84:0x01b9, B:85:0x01c5, B:86:0x01c6, B:87:0x01c7, B:42:0x0109, B:45:0x0119, B:48:0x0123, B:50:0x0129, B:52:0x0130, B:54:0x0136, B:61:0x014b, B:63:0x0152, B:71:0x017f, B:67:0x0172, B:70:0x017e, B:390:0x069e, B:392:0x06ab, B:395:0x06af, B:397:0x06b9, B:399:0x06c3, B:403:0x06cb, B:401:0x06c8, B:406:0x06dd, B:409:0x06e3, B:415:0x06ff), top: B:446:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x051e A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TryCatch #17 {IOException -> 0x008c, XmlPullParserException -> 0x008f, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007f, B:16:0x0087, B:22:0x0094, B:25:0x00a0, B:29:0x00b4, B:31:0x00cd, B:33:0x00d9, B:34:0x00dd, B:36:0x00e9, B:37:0x00ed, B:72:0x0188, B:91:0x01e5, B:94:0x01f3, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0227, B:110:0x022f, B:112:0x0237, B:114:0x023d, B:116:0x0243, B:118:0x024b, B:120:0x0253, B:123:0x025c, B:410:0x06e6, B:124:0x027f, B:126:0x0285, B:128:0x028e, B:130:0x029d, B:132:0x02a8, B:134:0x02bc, B:136:0x02c2, B:278:0x0523, B:138:0x02c9, B:140:0x02d1, B:142:0x02d7, B:144:0x02e2, B:146:0x02ea, B:147:0x02f1, B:150:0x02f8, B:277:0x051e, B:153:0x0306, B:155:0x030e, B:157:0x0314, B:159:0x031c, B:161:0x0322, B:164:0x0337, B:166:0x033d, B:168:0x034a, B:189:0x03b1, B:191:0x03b7, B:193:0x03bd, B:195:0x03c5, B:197:0x03cb, B:200:0x03e0, B:202:0x03e6, B:204:0x03f3, B:225:0x0472, B:227:0x047a, B:247:0x04c0, B:249:0x04c8, B:275:0x0511, B:205:0x03ff, B:206:0x0400, B:207:0x0401, B:209:0x0412, B:212:0x041a, B:215:0x0429, B:217:0x042f, B:219:0x043a, B:220:0x044e, B:221:0x044f, B:222:0x0450, B:223:0x045e, B:170:0x0353, B:171:0x0354, B:172:0x0355, B:173:0x035f, B:176:0x0369, B:179:0x0374, B:181:0x037a, B:183:0x0385, B:184:0x0394, B:185:0x0395, B:186:0x0396, B:187:0x03a1, B:283:0x0537, B:286:0x055a, B:342:0x0605, B:320:0x05bc, B:323:0x05c5, B:385:0x0681, B:330:0x05d8, B:333:0x05e2, B:337:0x05f0, B:340:0x05f7, B:341:0x05fe, B:347:0x061a, B:351:0x0626, B:355:0x062f, B:363:0x0641, B:372:0x0659, B:374:0x0665, B:376:0x066a, B:367:0x064a, B:75:0x0191, B:77:0x019d, B:80:0x01a8, B:82:0x01ae, B:84:0x01b9, B:85:0x01c5, B:86:0x01c6, B:87:0x01c7, B:42:0x0109, B:45:0x0119, B:48:0x0123, B:50:0x0129, B:52:0x0130, B:54:0x0136, B:61:0x014b, B:63:0x0152, B:71:0x017f, B:67:0x0172, B:70:0x017e, B:390:0x069e, B:392:0x06ab, B:395:0x06af, B:397:0x06b9, B:399:0x06c3, B:403:0x06cb, B:401:0x06c8, B:406:0x06dd, B:409:0x06e3, B:415:0x06ff), top: B:446:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x052f A[LOOP:1: B:126:0x0285->B:281:0x052f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x066a A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, zzakh -> 0x066e, TRY_LEAVE, TryCatch #5 {zzakh -> 0x066e, blocks: (B:374:0x0665, B:376:0x066a), top: B:428:0x0665 }] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0529 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0191 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TryCatch #17 {IOException -> 0x008c, XmlPullParserException -> 0x008f, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007f, B:16:0x0087, B:22:0x0094, B:25:0x00a0, B:29:0x00b4, B:31:0x00cd, B:33:0x00d9, B:34:0x00dd, B:36:0x00e9, B:37:0x00ed, B:72:0x0188, B:91:0x01e5, B:94:0x01f3, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0227, B:110:0x022f, B:112:0x0237, B:114:0x023d, B:116:0x0243, B:118:0x024b, B:120:0x0253, B:123:0x025c, B:410:0x06e6, B:124:0x027f, B:126:0x0285, B:128:0x028e, B:130:0x029d, B:132:0x02a8, B:134:0x02bc, B:136:0x02c2, B:278:0x0523, B:138:0x02c9, B:140:0x02d1, B:142:0x02d7, B:144:0x02e2, B:146:0x02ea, B:147:0x02f1, B:150:0x02f8, B:277:0x051e, B:153:0x0306, B:155:0x030e, B:157:0x0314, B:159:0x031c, B:161:0x0322, B:164:0x0337, B:166:0x033d, B:168:0x034a, B:189:0x03b1, B:191:0x03b7, B:193:0x03bd, B:195:0x03c5, B:197:0x03cb, B:200:0x03e0, B:202:0x03e6, B:204:0x03f3, B:225:0x0472, B:227:0x047a, B:247:0x04c0, B:249:0x04c8, B:275:0x0511, B:205:0x03ff, B:206:0x0400, B:207:0x0401, B:209:0x0412, B:212:0x041a, B:215:0x0429, B:217:0x042f, B:219:0x043a, B:220:0x044e, B:221:0x044f, B:222:0x0450, B:223:0x045e, B:170:0x0353, B:171:0x0354, B:172:0x0355, B:173:0x035f, B:176:0x0369, B:179:0x0374, B:181:0x037a, B:183:0x0385, B:184:0x0394, B:185:0x0395, B:186:0x0396, B:187:0x03a1, B:283:0x0537, B:286:0x055a, B:342:0x0605, B:320:0x05bc, B:323:0x05c5, B:385:0x0681, B:330:0x05d8, B:333:0x05e2, B:337:0x05f0, B:340:0x05f7, B:341:0x05fe, B:347:0x061a, B:351:0x0626, B:355:0x062f, B:363:0x0641, B:372:0x0659, B:374:0x0665, B:376:0x066a, B:367:0x064a, B:75:0x0191, B:77:0x019d, B:80:0x01a8, B:82:0x01ae, B:84:0x01b9, B:85:0x01c5, B:86:0x01c6, B:87:0x01c7, B:42:0x0109, B:45:0x0119, B:48:0x0123, B:50:0x0129, B:52:0x0130, B:54:0x0136, B:61:0x014b, B:63:0x0152, B:71:0x017f, B:67:0x0172, B:70:0x017e, B:390:0x069e, B:392:0x06ab, B:395:0x06af, B:397:0x06b9, B:399:0x06c3, B:403:0x06cb, B:401:0x06c8, B:406:0x06dd, B:409:0x06e3, B:415:0x06ff), top: B:446:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f3 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TRY_ENTER, TryCatch #17 {IOException -> 0x008c, XmlPullParserException -> 0x008f, blocks: (B:3:0x0006, B:6:0x0058, B:8:0x0067, B:11:0x0073, B:14:0x007f, B:16:0x0087, B:22:0x0094, B:25:0x00a0, B:29:0x00b4, B:31:0x00cd, B:33:0x00d9, B:34:0x00dd, B:36:0x00e9, B:37:0x00ed, B:72:0x0188, B:91:0x01e5, B:94:0x01f3, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0227, B:110:0x022f, B:112:0x0237, B:114:0x023d, B:116:0x0243, B:118:0x024b, B:120:0x0253, B:123:0x025c, B:410:0x06e6, B:124:0x027f, B:126:0x0285, B:128:0x028e, B:130:0x029d, B:132:0x02a8, B:134:0x02bc, B:136:0x02c2, B:278:0x0523, B:138:0x02c9, B:140:0x02d1, B:142:0x02d7, B:144:0x02e2, B:146:0x02ea, B:147:0x02f1, B:150:0x02f8, B:277:0x051e, B:153:0x0306, B:155:0x030e, B:157:0x0314, B:159:0x031c, B:161:0x0322, B:164:0x0337, B:166:0x033d, B:168:0x034a, B:189:0x03b1, B:191:0x03b7, B:193:0x03bd, B:195:0x03c5, B:197:0x03cb, B:200:0x03e0, B:202:0x03e6, B:204:0x03f3, B:225:0x0472, B:227:0x047a, B:247:0x04c0, B:249:0x04c8, B:275:0x0511, B:205:0x03ff, B:206:0x0400, B:207:0x0401, B:209:0x0412, B:212:0x041a, B:215:0x0429, B:217:0x042f, B:219:0x043a, B:220:0x044e, B:221:0x044f, B:222:0x0450, B:223:0x045e, B:170:0x0353, B:171:0x0354, B:172:0x0355, B:173:0x035f, B:176:0x0369, B:179:0x0374, B:181:0x037a, B:183:0x0385, B:184:0x0394, B:185:0x0395, B:186:0x0396, B:187:0x03a1, B:283:0x0537, B:286:0x055a, B:342:0x0605, B:320:0x05bc, B:323:0x05c5, B:385:0x0681, B:330:0x05d8, B:333:0x05e2, B:337:0x05f0, B:340:0x05f7, B:341:0x05fe, B:347:0x061a, B:351:0x0626, B:355:0x062f, B:363:0x0641, B:372:0x0659, B:374:0x0665, B:376:0x066a, B:367:0x064a, B:75:0x0191, B:77:0x019d, B:80:0x01a8, B:82:0x01ae, B:84:0x01b9, B:85:0x01c5, B:86:0x01c6, B:87:0x01c7, B:42:0x0109, B:45:0x0119, B:48:0x0123, B:50:0x0129, B:52:0x0130, B:54:0x0136, B:61:0x014b, B:63:0x0152, B:71:0x017f, B:67:0x0172, B:70:0x017e, B:390:0x069e, B:392:0x06ab, B:395:0x06af, B:397:0x06b9, B:399:0x06c3, B:403:0x06cb, B:401:0x06c8, B:406:0x06dd, B:409:0x06e3, B:415:0x06ff), top: B:446:0x0006 }] */
    /* JADX WARN: Type inference failed for: r42v1, types: [java.lang.Throwable, com.google.android.gms.internal.ads.zzalo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzakg b(byte[] bArr, int i2, int i3) {
        String str;
        String str2;
        ArrayDeque arrayDeque;
        zzalj zzaljVar;
        zzalp zzalpVar;
        int i4;
        ArrayDeque arrayDeque2;
        zzali zzaliVar;
        int i5;
        zzalj zzaljVar2;
        int i6;
        zzalo f2;
        String str3;
        long j;
        long j2;
        long j3;
        String[] strArr;
        String str4;
        zzali zzaliVar2;
        zzali zzaliVar3;
        long j4;
        long j5;
        long j6;
        char c2;
        zzalj zzaljVar3;
        float f3;
        float f4;
        float f5;
        String str5;
        float f6;
        float f7;
        int i7;
        float f8;
        String a;
        int i8;
        zzalm zzalmVar;
        char c3;
        char c4;
        String group;
        String a2;
        zzalo zzaloVar;
        String a3;
        zzalo zzaloVar2;
        String a4;
        int i9;
        float f9;
        zzalj zzaljVar4;
        String group2;
        String group3;
        boolean z;
        String a5;
        String group4;
        String[] split;
        boolean z2;
        String str6 = "";
        String str7 = C5202av2.q;
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new zzalm("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            zzalj zzaljVar5 = i;
            zzalp zzalpVar2 = null;
            zzalk zzalkVar = null;
            zzalj zzaljVar6 = zzaljVar5;
            int i10 = 0;
            int i11 = 15;
            while (eventType != 1) {
                zzali zzaliVar4 = (zzali) arrayDeque3.peek();
                ?? r42 = obj;
                if (i10 == 0) {
                    String name = newPullParser.getName();
                    str = str6;
                    if (eventType == 2) {
                        if (C5445bv2.n.equals(name)) {
                            String attributeValue = newPullParser.getAttributeValue(str7, "frameRate");
                            if (attributeValue != null) {
                                i9 = Integer.parseInt(attributeValue);
                            } else {
                                i9 = 30;
                            }
                            String attributeValue2 = newPullParser.getAttributeValue(str7, "frameRateMultiplier");
                            zzalpVar = zzalpVar2;
                            if (attributeValue2 != null) {
                                String str8 = zzeu.a;
                                i4 = i10;
                                if (attributeValue2.split(C4500Ve2.b, -1).length == 2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zzdc.e(z2, "frameRateMultiplier doesn't have 2 parts");
                                f9 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
                            } else {
                                i4 = i10;
                                f9 = 1.0f;
                            }
                            int i12 = zzaljVar5.b;
                            float f10 = f9;
                            String attributeValue3 = newPullParser.getAttributeValue(str7, "subFrameRate");
                            if (attributeValue3 != null) {
                                i12 = Integer.parseInt(attributeValue3);
                            }
                            int i13 = zzaljVar5.c;
                            zzaljVar = zzaljVar5;
                            String attributeValue4 = newPullParser.getAttributeValue(str7, "tickRate");
                            if (attributeValue4 != null) {
                                i13 = Integer.parseInt(attributeValue4);
                            }
                            zzalj zzaljVar7 = new zzalj(i9 * f10, i12, i13);
                            String attributeValue5 = newPullParser.getAttributeValue(str7, "cellResolution");
                            if (attributeValue5 == null) {
                                str2 = str7;
                            } else {
                                Matcher matcher = h.matcher(attributeValue5);
                                str2 = str7;
                                if (!matcher.matches()) {
                                    zzdx.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                } else {
                                    try {
                                        group2 = matcher.group(1);
                                    } catch (NumberFormatException unused) {
                                        arrayDeque2 = arrayDeque3;
                                        zzaljVar4 = zzaljVar7;
                                    }
                                    if (group2 != null) {
                                        int parseInt = Integer.parseInt(group2);
                                        zzaljVar4 = zzaljVar7;
                                        try {
                                            group3 = matcher.group(2);
                                        } catch (NumberFormatException unused2) {
                                            arrayDeque2 = arrayDeque3;
                                        }
                                        if (group3 != null) {
                                            i5 = Integer.parseInt(group3);
                                            if (parseInt != 0) {
                                                if (i5 != 0) {
                                                    arrayDeque2 = arrayDeque3;
                                                    z = true;
                                                    StringBuilder sb = new StringBuilder();
                                                    zzaliVar = zzaliVar4;
                                                    sb.append("Invalid cell resolution ");
                                                    sb.append(parseInt);
                                                    sb.append(C4500Ve2.b);
                                                    sb.append(i5);
                                                    zzdc.e(z, sb.toString());
                                                    a5 = zzev.a(newPullParser, C5445bv2.F);
                                                    if (a5 != null) {
                                                        Matcher matcher2 = g.matcher(a5);
                                                        if (!matcher2.matches()) {
                                                            zzdx.f("TtmlParser", "Ignoring non-pixel tts extent: ".concat(a5));
                                                        } else {
                                                            try {
                                                                group4 = matcher2.group(1);
                                                            } catch (NumberFormatException unused3) {
                                                                zzdx.f("TtmlParser", "Ignoring malformed tts extent: ".concat(a5));
                                                            }
                                                            if (group4 != null) {
                                                                int parseInt2 = Integer.parseInt(group4);
                                                                String group5 = matcher2.group(2);
                                                                if (group5 != null) {
                                                                    zzalkVar = new zzalk(parseInt2, Integer.parseInt(group5));
                                                                    zzaljVar6 = zzaljVar4;
                                                                } else {
                                                                    throw r42;
                                                                }
                                                            } else {
                                                                throw r42;
                                                            }
                                                        }
                                                    }
                                                    zzalkVar = r42;
                                                    zzaljVar6 = zzaljVar4;
                                                } else {
                                                    i5 = 0;
                                                    z = false;
                                                }
                                            } else {
                                                z = false;
                                            }
                                            arrayDeque2 = arrayDeque3;
                                            StringBuilder sb2 = new StringBuilder();
                                            zzaliVar = zzaliVar4;
                                            sb2.append("Invalid cell resolution ");
                                            sb2.append(parseInt);
                                            sb2.append(C4500Ve2.b);
                                            sb2.append(i5);
                                            zzdc.e(z, sb2.toString());
                                            a5 = zzev.a(newPullParser, C5445bv2.F);
                                            if (a5 != null) {
                                            }
                                            zzalkVar = r42;
                                            zzaljVar6 = zzaljVar4;
                                        } else {
                                            throw r42;
                                        }
                                    } else {
                                        throw r42;
                                    }
                                }
                            }
                            arrayDeque2 = arrayDeque3;
                            zzaljVar4 = zzaljVar7;
                            zzaliVar = zzaliVar4;
                            i5 = 15;
                            a5 = zzev.a(newPullParser, C5445bv2.F);
                            if (a5 != null) {
                            }
                            zzalkVar = r42;
                            zzaljVar6 = zzaljVar4;
                        } else {
                            str2 = str7;
                            arrayDeque2 = arrayDeque3;
                            zzaljVar = zzaljVar5;
                            zzaliVar = zzaliVar4;
                            zzalpVar = zzalpVar2;
                            i4 = i10;
                            i5 = i11;
                        }
                        zzalk zzalkVar2 = zzalkVar;
                        String str9 = "metadata";
                        if (!name.equals(C5445bv2.n) && !name.equals(C5445bv2.f701o) && !name.equals("body") && !name.equals(C5445bv2.q) && !name.equals("p") && !name.equals(C5445bv2.s) && !name.equals("br") && !name.equals("style") && !name.equals(C5445bv2.v) && !name.equals(C5445bv2.w) && !name.equals("region") && !name.equals("metadata") && !name.equals("image") && !name.equals("data") && !name.equals(C5445bv2.B)) {
                            zzdx.e("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            zzalkVar = zzalkVar2;
                            i11 = i5;
                            zzalpVar2 = zzalpVar;
                            arrayDeque = arrayDeque2;
                            i10 = 1;
                        }
                        if (C5445bv2.f701o.equals(name)) {
                            while (true) {
                                newPullParser.next();
                                if (zzev.c(newPullParser, "style")) {
                                    String a6 = zzev.a(newPullParser, "style");
                                    zzalo f11 = f(newPullParser, new zzalo());
                                    if (a6 != null) {
                                        String[] g2 = g(a6);
                                        zzaljVar3 = zzaljVar6;
                                        int i14 = 0;
                                        for (int length = g2.length; i14 < length; length = length) {
                                            f11.z((zzalo) hashMap.get(g2[i14]));
                                            i14++;
                                        }
                                    } else {
                                        zzaljVar3 = zzaljVar6;
                                    }
                                    String h2 = f11.h();
                                    if (h2 != null) {
                                        hashMap.put(h2, f11);
                                    }
                                } else {
                                    zzaljVar3 = zzaljVar6;
                                    if (!zzev.c(newPullParser, "region")) {
                                        if (zzev.c(newPullParser, str9)) {
                                            do {
                                                newPullParser.next();
                                                if (zzev.c(newPullParser, "image") && (a4 = zzev.a(newPullParser, "id")) != null) {
                                                    hashMap3.put(a4, newPullParser.nextText());
                                                }
                                            } while (!zzev.b(newPullParser, str9));
                                        }
                                    } else {
                                        String a7 = zzev.a(newPullParser, "id");
                                        if (a7 != null) {
                                            String a8 = zzev.a(newPullParser, "origin");
                                            if (a8 == null && (a3 = zzev.a(newPullParser, "style")) != null && (zzaloVar2 = (zzalo) hashMap.get(a3)) != null) {
                                                a8 = zzaloVar2.i();
                                            }
                                            if (a8 != null) {
                                                Matcher matcher3 = f.matcher(a8);
                                                Matcher matcher4 = g.matcher(a8);
                                                if (matcher3.matches()) {
                                                    f3 = 100.0f;
                                                    try {
                                                        String group6 = matcher3.group(1);
                                                        if (group6 != null) {
                                                            f5 = Float.parseFloat(group6) / 100.0f;
                                                            String group7 = matcher3.group(2);
                                                            if (group7 != null) {
                                                                f4 = Float.parseFloat(group7) / 100.0f;
                                                            } else {
                                                                throw r42;
                                                            }
                                                        } else {
                                                            throw r42;
                                                        }
                                                    } catch (NumberFormatException unused4) {
                                                        zzdx.f("TtmlParser", "Ignoring region with malformed origin: ".concat(a8));
                                                    }
                                                } else {
                                                    f3 = 100.0f;
                                                    if (matcher4.matches()) {
                                                        if (zzalkVar2 == null) {
                                                            zzdx.f("TtmlParser", "Ignoring region with missing tts:extent: ".concat(a8));
                                                        } else {
                                                            try {
                                                                String group8 = matcher4.group(1);
                                                                if (group8 != null) {
                                                                    int parseInt3 = Integer.parseInt(group8);
                                                                    String group9 = matcher4.group(2);
                                                                    if (group9 != null) {
                                                                        f5 = parseInt3 / zzalkVar2.a;
                                                                        f4 = Integer.parseInt(group9) / zzalkVar2.b;
                                                                    } else {
                                                                        throw r42;
                                                                    }
                                                                } else {
                                                                    throw r42;
                                                                }
                                                            } catch (NumberFormatException unused5) {
                                                                zzdx.f("TtmlParser", "Ignoring region with malformed origin: ".concat(a8));
                                                            }
                                                        }
                                                    } else {
                                                        zzdx.f("TtmlParser", "Ignoring region with unsupported origin: ".concat(a8));
                                                    }
                                                }
                                            } else {
                                                f3 = 100.0f;
                                                f4 = 0.0f;
                                                f5 = 0.0f;
                                            }
                                            float f12 = f5;
                                            String a9 = zzev.a(newPullParser, C5445bv2.F);
                                            if (a9 == null && (a2 = zzev.a(newPullParser, "style")) != null && (zzaloVar = (zzalo) hashMap.get(a2)) != null) {
                                                a9 = zzaloVar.f();
                                            }
                                            if (a9 != null) {
                                                Matcher matcher5 = f.matcher(a9);
                                                str5 = str9;
                                                Matcher matcher6 = g.matcher(a9);
                                                if (matcher5.matches()) {
                                                    try {
                                                        String group10 = matcher5.group(1);
                                                        if (group10 != null) {
                                                            float parseFloat = Float.parseFloat(group10) / f3;
                                                            String group11 = matcher5.group(2);
                                                            if (group11 != null) {
                                                                f7 = Float.parseFloat(group11) / f3;
                                                                f6 = parseFloat;
                                                            } else {
                                                                throw r42;
                                                            }
                                                        } else {
                                                            throw r42;
                                                        }
                                                    } catch (NumberFormatException unused6) {
                                                        zzdx.f("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(a8)));
                                                    }
                                                } else {
                                                    if (matcher6.matches()) {
                                                        if (zzalkVar2 == null) {
                                                            zzdx.f("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(a8)));
                                                        } else {
                                                            try {
                                                                String group12 = matcher6.group(1);
                                                                if (group12 != null) {
                                                                    int parseInt4 = Integer.parseInt(group12);
                                                                    if (matcher6.group(2) != null) {
                                                                        f7 = Integer.parseInt(group) / zzalkVar2.b;
                                                                        f6 = parseInt4 / zzalkVar2.a;
                                                                    } else {
                                                                        throw r42;
                                                                    }
                                                                } else {
                                                                    throw r42;
                                                                }
                                                            } catch (NumberFormatException unused7) {
                                                                zzdx.f("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(a8)));
                                                            }
                                                        }
                                                    } else {
                                                        zzdx.f("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(a8)));
                                                    }
                                                    zzalmVar = r42;
                                                    if (zzalmVar != null) {
                                                        hashMap2.put(zzalmVar.a, zzalmVar);
                                                    }
                                                    if (!zzev.b(newPullParser, C5445bv2.f701o)) {
                                                        zzaljVar2 = zzaljVar3;
                                                        arrayDeque = arrayDeque2;
                                                    } else {
                                                        zzaljVar6 = zzaljVar3;
                                                        str9 = str5;
                                                    }
                                                }
                                            } else {
                                                str5 = str9;
                                                f6 = 1.0f;
                                                f7 = 1.0f;
                                            }
                                            String a10 = zzev.a(newPullParser, C5445bv2.G);
                                            if (a10 != null) {
                                                String a11 = zzfui.a(a10);
                                                int hashCode = a11.hashCode();
                                                if (hashCode != -1364013995) {
                                                    if (hashCode == 92734940 && a11.equals(C5445bv2.d0)) {
                                                        c4 = 1;
                                                        if (c4 == 0) {
                                                            if (c4 == 1) {
                                                                f8 = f4 + f7;
                                                                i7 = 2;
                                                            }
                                                        } else {
                                                            f8 = f4 + (f7 / 2.0f);
                                                            i7 = 1;
                                                        }
                                                        float f13 = 1.0f / i5;
                                                        a = zzev.a(newPullParser, C5445bv2.T);
                                                        if (a != null) {
                                                            String a12 = zzfui.a(a);
                                                            int hashCode2 = a12.hashCode();
                                                            if (hashCode2 != 3694) {
                                                                if (hashCode2 != 3553396) {
                                                                    if (hashCode2 == 3553576 && a12.equals(C5445bv2.u0)) {
                                                                        c3 = 2;
                                                                        if (c3 == 0 && c3 != 1) {
                                                                            if (c3 == 2) {
                                                                                i8 = 1;
                                                                            }
                                                                        } else {
                                                                            i8 = 2;
                                                                        }
                                                                        zzalmVar = new zzalm(a7, f12, f8, 0, i7, f6, f7, 1, f13, i8);
                                                                        if (zzalmVar != null) {
                                                                        }
                                                                        if (!zzev.b(newPullParser, C5445bv2.f701o)) {
                                                                        }
                                                                    }
                                                                    c3 = 65535;
                                                                    if (c3 == 0) {
                                                                    }
                                                                    i8 = 2;
                                                                    zzalmVar = new zzalm(a7, f12, f8, 0, i7, f6, f7, 1, f13, i8);
                                                                    if (zzalmVar != null) {
                                                                    }
                                                                    if (!zzev.b(newPullParser, C5445bv2.f701o)) {
                                                                    }
                                                                } else {
                                                                    if (a12.equals(C5445bv2.t0)) {
                                                                        c3 = 1;
                                                                        if (c3 == 0) {
                                                                        }
                                                                        i8 = 2;
                                                                        zzalmVar = new zzalm(a7, f12, f8, 0, i7, f6, f7, 1, f13, i8);
                                                                        if (zzalmVar != null) {
                                                                        }
                                                                        if (!zzev.b(newPullParser, C5445bv2.f701o)) {
                                                                        }
                                                                    }
                                                                    c3 = 65535;
                                                                    if (c3 == 0) {
                                                                    }
                                                                    i8 = 2;
                                                                    zzalmVar = new zzalm(a7, f12, f8, 0, i7, f6, f7, 1, f13, i8);
                                                                    if (zzalmVar != null) {
                                                                    }
                                                                    if (!zzev.b(newPullParser, C5445bv2.f701o)) {
                                                                    }
                                                                }
                                                            } else {
                                                                if (a12.equals("tb")) {
                                                                    c3 = 0;
                                                                    if (c3 == 0) {
                                                                    }
                                                                    i8 = 2;
                                                                    zzalmVar = new zzalm(a7, f12, f8, 0, i7, f6, f7, 1, f13, i8);
                                                                    if (zzalmVar != null) {
                                                                    }
                                                                    if (!zzev.b(newPullParser, C5445bv2.f701o)) {
                                                                    }
                                                                }
                                                                c3 = 65535;
                                                                if (c3 == 0) {
                                                                }
                                                                i8 = 2;
                                                                zzalmVar = new zzalm(a7, f12, f8, 0, i7, f6, f7, 1, f13, i8);
                                                                if (zzalmVar != null) {
                                                                }
                                                                if (!zzev.b(newPullParser, C5445bv2.f701o)) {
                                                                }
                                                            }
                                                        }
                                                        i8 = Integer.MIN_VALUE;
                                                        zzalmVar = new zzalm(a7, f12, f8, 0, i7, f6, f7, 1, f13, i8);
                                                        if (zzalmVar != null) {
                                                        }
                                                        if (!zzev.b(newPullParser, C5445bv2.f701o)) {
                                                        }
                                                    }
                                                    c4 = 65535;
                                                    if (c4 == 0) {
                                                    }
                                                    float f132 = 1.0f / i5;
                                                    a = zzev.a(newPullParser, C5445bv2.T);
                                                    if (a != null) {
                                                    }
                                                    i8 = Integer.MIN_VALUE;
                                                    zzalmVar = new zzalm(a7, f12, f8, 0, i7, f6, f7, 1, f132, i8);
                                                    if (zzalmVar != null) {
                                                    }
                                                    if (!zzev.b(newPullParser, C5445bv2.f701o)) {
                                                    }
                                                } else {
                                                    if (a11.equals(C5445bv2.m0)) {
                                                        c4 = 0;
                                                        if (c4 == 0) {
                                                        }
                                                        float f1322 = 1.0f / i5;
                                                        a = zzev.a(newPullParser, C5445bv2.T);
                                                        if (a != null) {
                                                        }
                                                        i8 = Integer.MIN_VALUE;
                                                        zzalmVar = new zzalm(a7, f12, f8, 0, i7, f6, f7, 1, f1322, i8);
                                                        if (zzalmVar != null) {
                                                        }
                                                        if (!zzev.b(newPullParser, C5445bv2.f701o)) {
                                                        }
                                                    }
                                                    c4 = 65535;
                                                    if (c4 == 0) {
                                                    }
                                                    float f13222 = 1.0f / i5;
                                                    a = zzev.a(newPullParser, C5445bv2.T);
                                                    if (a != null) {
                                                    }
                                                    i8 = Integer.MIN_VALUE;
                                                    zzalmVar = new zzalm(a7, f12, f8, 0, i7, f6, f7, 1, f13222, i8);
                                                    if (zzalmVar != null) {
                                                    }
                                                    if (!zzev.b(newPullParser, C5445bv2.f701o)) {
                                                    }
                                                }
                                            }
                                            i7 = 0;
                                            f8 = f4;
                                            float f132222 = 1.0f / i5;
                                            a = zzev.a(newPullParser, C5445bv2.T);
                                            if (a != null) {
                                            }
                                            i8 = Integer.MIN_VALUE;
                                            zzalmVar = new zzalm(a7, f12, f8, 0, i7, f6, f7, 1, f132222, i8);
                                            if (zzalmVar != null) {
                                            }
                                            if (!zzev.b(newPullParser, C5445bv2.f701o)) {
                                            }
                                        }
                                        zzalmVar = r42;
                                        str5 = str9;
                                        if (zzalmVar != null) {
                                        }
                                        if (!zzev.b(newPullParser, C5445bv2.f701o)) {
                                        }
                                    }
                                }
                                str5 = str9;
                                if (!zzev.b(newPullParser, C5445bv2.f701o)) {
                                }
                            }
                        } else {
                            zzalj zzaljVar8 = zzaljVar6;
                            try {
                                int attributeCount = newPullParser.getAttributeCount();
                                f2 = f(newPullParser, r42);
                                int i15 = 0;
                                str3 = str;
                                j = C10323vs.b;
                                j2 = C10323vs.b;
                                j3 = C10323vs.b;
                                strArr = null;
                                str4 = null;
                                while (i15 < attributeCount) {
                                    try {
                                        String attributeName = newPullParser.getAttributeName(i15);
                                        String attributeValue6 = newPullParser.getAttributeValue(i15);
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                if (attributeName.equals("region")) {
                                                    c2 = 4;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 99841:
                                                if (attributeName.equals(C5202av2.s)) {
                                                    c2 = 2;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 100571:
                                                if (attributeName.equals("end")) {
                                                    c2 = 1;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals(C5202av2.r)) {
                                                    c2 = 0;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals("style")) {
                                                    c2 = 3;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals(C5202av2.w)) {
                                                    c2 = 5;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            default:
                                                c2 = 65535;
                                                break;
                                        }
                                        if (c2 != 0) {
                                            i6 = 1;
                                            if (c2 != 1) {
                                                if (c2 != 2) {
                                                    if (c2 != 3) {
                                                        if (c2 != 4) {
                                                            if (c2 == 5) {
                                                                try {
                                                                    if (attributeValue6.startsWith("#")) {
                                                                        i6 = 1;
                                                                        try {
                                                                            str4 = attributeValue6.substring(1);
                                                                        } catch (zzakh e2) {
                                                                            e = e2;
                                                                            zzaljVar2 = zzaljVar8;
                                                                            arrayDeque = arrayDeque2;
                                                                            zzdx.g("TtmlParser", "Suppressing parser error", e);
                                                                            zzalkVar = zzalkVar2;
                                                                            zzaljVar6 = zzaljVar2;
                                                                            i11 = i5;
                                                                            i10 = i6;
                                                                            zzalpVar2 = zzalpVar;
                                                                            newPullParser.next();
                                                                            eventType = newPullParser.getEventType();
                                                                            arrayDeque3 = arrayDeque;
                                                                            str6 = str;
                                                                            zzaljVar5 = zzaljVar;
                                                                            str7 = str2;
                                                                            obj = null;
                                                                        }
                                                                    }
                                                                } catch (zzakh e3) {
                                                                    e = e3;
                                                                    i6 = 1;
                                                                }
                                                            }
                                                            i6 = 1;
                                                        } else {
                                                            i6 = 1;
                                                            if (hashMap2.containsKey(attributeValue6)) {
                                                                str3 = attributeValue6;
                                                            }
                                                        }
                                                    } else {
                                                        i6 = 1;
                                                        String[] g3 = g(attributeValue6);
                                                        if (g3.length > 0) {
                                                            strArr = g3;
                                                        }
                                                    }
                                                    zzaljVar2 = zzaljVar8;
                                                    continue;
                                                } else {
                                                    zzaljVar2 = zzaljVar8;
                                                    i6 = 1;
                                                    try {
                                                        j3 = c(attributeValue6, zzaljVar2);
                                                        continue;
                                                    } catch (zzakh e4) {
                                                        e = e4;
                                                        arrayDeque = arrayDeque2;
                                                        zzdx.g("TtmlParser", "Suppressing parser error", e);
                                                        zzalkVar = zzalkVar2;
                                                        zzaljVar6 = zzaljVar2;
                                                        i11 = i5;
                                                        i10 = i6;
                                                        zzalpVar2 = zzalpVar;
                                                        newPullParser.next();
                                                        eventType = newPullParser.getEventType();
                                                        arrayDeque3 = arrayDeque;
                                                        str6 = str;
                                                        zzaljVar5 = zzaljVar;
                                                        str7 = str2;
                                                        obj = null;
                                                    }
                                                }
                                            } else {
                                                zzaljVar2 = zzaljVar8;
                                                j = c(attributeValue6, zzaljVar2);
                                                continue;
                                            }
                                        } else {
                                            zzaljVar2 = zzaljVar8;
                                            i6 = 1;
                                            j2 = c(attributeValue6, zzaljVar2);
                                            continue;
                                        }
                                        i15++;
                                        zzaljVar8 = zzaljVar2;
                                    } catch (zzakh e5) {
                                        e = e5;
                                        zzaljVar2 = zzaljVar8;
                                        i6 = 1;
                                    }
                                }
                                zzaljVar2 = zzaljVar8;
                                i6 = 1;
                                if (zzaliVar != null) {
                                    zzaliVar2 = zzaliVar;
                                    long j7 = zzaliVar2.d;
                                    if (j7 != C10323vs.b) {
                                        if (j2 != C10323vs.b) {
                                            j2 += j7;
                                        } else {
                                            j2 = -9223372036854775807L;
                                        }
                                        if (j != C10323vs.b) {
                                            j += j7;
                                        } else {
                                            zzaliVar3 = zzaliVar2;
                                            j = -9223372036854775807L;
                                        }
                                    }
                                    zzaliVar3 = zzaliVar2;
                                } else {
                                    zzaliVar2 = zzaliVar;
                                    zzaliVar3 = null;
                                }
                            } catch (zzakh e6) {
                                e = e6;
                                zzaljVar2 = zzaljVar8;
                                arrayDeque = arrayDeque2;
                                i6 = 1;
                            }
                            try {
                                if (j == C10323vs.b) {
                                    if (j3 != C10323vs.b) {
                                        j6 = j2 + j3;
                                    } else {
                                        if (zzaliVar3 != null) {
                                            j6 = zzaliVar3.e;
                                            if (j6 != C10323vs.b) {
                                            }
                                        }
                                        j5 = j2;
                                        j4 = -9223372036854775807L;
                                        zzali b2 = zzali.b(newPullParser.getName(), j5, j4, f2, strArr, str3, str4, zzaliVar3);
                                        arrayDeque = arrayDeque2;
                                        arrayDeque.push(b2);
                                        if (zzaliVar2 != null) {
                                            zzaliVar2.f(b2);
                                        }
                                    }
                                    j4 = j6;
                                } else {
                                    j4 = j;
                                }
                                arrayDeque.push(b2);
                                if (zzaliVar2 != null) {
                                }
                            } catch (zzakh e7) {
                                e = e7;
                                zzdx.g("TtmlParser", "Suppressing parser error", e);
                                zzalkVar = zzalkVar2;
                                zzaljVar6 = zzaljVar2;
                                i11 = i5;
                                i10 = i6;
                                zzalpVar2 = zzalpVar;
                                newPullParser.next();
                                eventType = newPullParser.getEventType();
                                arrayDeque3 = arrayDeque;
                                str6 = str;
                                zzaljVar5 = zzaljVar;
                                str7 = str2;
                                obj = null;
                            }
                            j5 = j2;
                            zzali b22 = zzali.b(newPullParser.getName(), j5, j4, f2, strArr, str3, str4, zzaliVar3);
                            arrayDeque = arrayDeque2;
                        }
                        zzalkVar = zzalkVar2;
                        zzaljVar6 = zzaljVar2;
                        i11 = i5;
                    } else {
                        str2 = str7;
                        arrayDeque = arrayDeque3;
                        zzaljVar = zzaljVar5;
                        zzalpVar = zzalpVar2;
                        i4 = i10;
                        if (eventType == 4) {
                            if (zzaliVar4 != null) {
                                zzaliVar4.f(zzali.c(newPullParser.getText()));
                            } else {
                                throw null;
                            }
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals(C5445bv2.n)) {
                                zzali zzaliVar5 = (zzali) arrayDeque.peek();
                                if (zzaliVar5 != null) {
                                    zzalpVar2 = new zzalp(zzaliVar5, hashMap, hashMap2, hashMap3);
                                } else {
                                    throw null;
                                }
                            } else {
                                zzalpVar2 = zzalpVar;
                            }
                            arrayDeque.pop();
                            i10 = i4;
                        }
                    }
                    zzalpVar2 = zzalpVar;
                    i10 = i4;
                } else {
                    str = str6;
                    str2 = str7;
                    arrayDeque = arrayDeque3;
                    zzaljVar = zzaljVar5;
                    zzalpVar = zzalpVar2;
                    i4 = i10;
                    if (eventType == 2) {
                        i10 = i4 + 1;
                    } else {
                        if (eventType == 3) {
                            i10 = i4 - 1;
                        }
                        zzalpVar2 = zzalpVar;
                        i10 = i4;
                    }
                    zzalpVar2 = zzalpVar;
                }
                newPullParser.next();
                eventType = newPullParser.getEventType();
                arrayDeque3 = arrayDeque;
                str6 = str;
                zzaljVar5 = zzaljVar;
                str7 = str2;
                obj = null;
            }
            zzalp zzalpVar3 = zzalpVar2;
            if (zzalpVar3 != null) {
                return zzalpVar3;
            }
            throw null;
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new IllegalStateException("Unable to decode source", e9);
        }
    }
}
