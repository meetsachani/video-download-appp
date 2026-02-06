package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.AbstractC4253Sp2;
import o.C8206nB;

/* loaded from: classes3.dex */
public final class zzas implements zzaq, Iterable<zzaq> {
    public final String X;

    public zzas(String str) {
        if (str != null) {
            this.X = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return new zzas(this.X);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double d() {
        if (this.X.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.X);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String e() {
        return this.X;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        return this.X.equals(((zzas) obj).X);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean f() {
        return Boolean.valueOf(!this.X.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> h() {
        return new zzav(this);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq i(String str, zzh zzhVar, List<zzaq> list) {
        Object obj;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        zzas zzasVar;
        String e;
        Matcher matcher;
        String e2;
        double doubleValue;
        double min;
        double min2;
        int i2;
        int length;
        int i3;
        zzh zzhVar2;
        String e3;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            obj = "hasOwnProperty";
            str2 = "trim";
        } else {
            obj = "hasOwnProperty";
            str2 = "trim";
            if (!str2.equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1789698943:
                str3 = "charAt";
                str4 = "toString";
                if (str.equals(obj)) {
                    str5 = "toLocaleLowerCase";
                    c = 0;
                    break;
                }
                str5 = "toLocaleLowerCase";
                break;
            case -1776922004:
                str3 = "charAt";
                str4 = "toString";
                if (str.equals(str4)) {
                    str5 = "toLocaleLowerCase";
                    c = 1;
                    break;
                }
                str5 = "toLocaleLowerCase";
                break;
            case -1464939364:
                str3 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    str5 = "toLocaleLowerCase";
                    str4 = "toString";
                    c = 2;
                    break;
                }
                str5 = "toLocaleLowerCase";
                str4 = "toString";
                break;
            case -1361633751:
                str3 = "charAt";
                if (str.equals(str3)) {
                    str5 = "toLocaleLowerCase";
                    str4 = "toString";
                    c = 3;
                    break;
                }
                str5 = "toLocaleLowerCase";
                str4 = "toString";
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    c = 4;
                }
                str5 = "toLocaleLowerCase";
                str3 = "charAt";
                str4 = "toString";
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c = 5;
                }
                str5 = "toLocaleLowerCase";
                str3 = "charAt";
                str4 = "toString";
                break;
            case -906336856:
                if (str.equals("search")) {
                    c = 6;
                }
                str5 = "toLocaleLowerCase";
                str3 = "charAt";
                str4 = "toString";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    c = 7;
                }
                str5 = "toLocaleLowerCase";
                str3 = "charAt";
                str4 = "toString";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = '\b';
                }
                str5 = "toLocaleLowerCase";
                str3 = "charAt";
                str4 = "toString";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c = '\t';
                }
                str5 = "toLocaleLowerCase";
                str3 = "charAt";
                str4 = "toString";
                break;
            case 3568674:
                if (str.equals(str2)) {
                    c = '\n';
                }
                str5 = "toLocaleLowerCase";
                str3 = "charAt";
                str4 = "toString";
                break;
            case 103668165:
                if (str.equals("match")) {
                    c = 11;
                }
                str5 = "toLocaleLowerCase";
                str3 = "charAt";
                str4 = "toString";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = '\f';
                }
                str5 = "toLocaleLowerCase";
                str3 = "charAt";
                str4 = "toString";
                break;
            case 109648666:
                if (str.equals("split")) {
                    c = C8206nB.d;
                }
                str5 = "toLocaleLowerCase";
                str3 = "charAt";
                str4 = "toString";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    c = 14;
                }
                str5 = "toLocaleLowerCase";
                str3 = "charAt";
                str4 = "toString";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    c = 15;
                }
                str5 = "toLocaleLowerCase";
                str3 = "charAt";
                str4 = "toString";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 16;
                }
                str5 = "toLocaleLowerCase";
                str3 = "charAt";
                str4 = "toString";
                break;
            default:
                str5 = "toLocaleLowerCase";
                str3 = "charAt";
                str4 = "toString";
                break;
        }
        switch (c) {
            case 0:
                zzg.g(obj, 1, list);
                String str6 = this.X;
                zzaq b = zzhVar.b(list.get(0));
                if ("length".equals(b.e())) {
                    return zzaq.n;
                }
                double doubleValue2 = b.d().doubleValue();
                if (doubleValue2 == Math.floor(doubleValue2) && (i = (int) doubleValue2) >= 0 && i < str6.length()) {
                    return zzaq.n;
                }
                return zzaq.f304o;
            case 1:
                zzg.g(str4, 0, list);
                return this;
            case 2:
                zzg.g(str5, 0, list);
                return new zzas(this.X.toLowerCase());
            case 3:
                zzg.n(str3, 1, list);
                int a = !list.isEmpty() ? (int) zzg.a(zzhVar.b(list.get(0)).d().doubleValue()) : 0;
                String str7 = this.X;
                if (a >= 0 && a < str7.length()) {
                    return new zzas(String.valueOf(str7.charAt(a)));
                }
                return zzaq.p;
            case 4:
                zzasVar = this;
                if (!list.isEmpty()) {
                    StringBuilder sb = new StringBuilder(zzasVar.X);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        sb.append(zzhVar.b(list.get(i4)).e());
                    }
                    return new zzas(sb.toString());
                }
                break;
            case 5:
                zzg.g("toLowerCase", 0, list);
                return new zzas(this.X.toLowerCase(Locale.ENGLISH));
            case 6:
                zzg.n("search", 1, list);
                if (!list.isEmpty()) {
                    e = zzhVar.b(list.get(0)).e();
                } else {
                    e = zzaq.i.e();
                }
                if (Pattern.compile(e).matcher(this.X).find()) {
                    return new zzai(Double.valueOf(matcher.start()));
                }
                return new zzai(Double.valueOf(-1.0d));
            case 7:
                zzg.g("toLocaleUpperCase", 0, list);
                return new zzas(this.X.toUpperCase());
            case '\b':
                zzg.n("lastIndexOf", 2, list);
                String str8 = this.X;
                if (list.size() <= 0) {
                    e2 = zzaq.i.e();
                } else {
                    e2 = zzhVar.b(list.get(0)).e();
                }
                return new zzai(Double.valueOf(str8.lastIndexOf(e2, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzhVar.b(list.get(1)).d().doubleValue()) ? Double.POSITIVE_INFINITY : zzg.a(doubleValue)))));
            case '\t':
                zzg.g("toUpperCase", 0, list);
                return new zzas(this.X.toUpperCase(Locale.ENGLISH));
            case '\n':
                zzg.g("toUpperCase", 0, list);
                return new zzas(this.X.trim());
            case 11:
                zzg.n("match", 1, list);
                Matcher matcher2 = Pattern.compile(list.size() <= 0 ? "" : zzhVar.b(list.get(0)).e()).matcher(this.X);
                if (matcher2.find()) {
                    return new zzaf(new zzas(matcher2.group()));
                }
                return zzaq.j;
            case '\f':
                zzg.n("slice", 2, list);
                String str9 = this.X;
                double a2 = zzg.a(!list.isEmpty() ? zzhVar.b(list.get(0)).d().doubleValue() : 0.0d);
                if (a2 < 0.0d) {
                    min = Math.max(str9.length() + a2, 0.0d);
                } else {
                    min = Math.min(a2, str9.length());
                }
                int i5 = (int) min;
                double a3 = zzg.a(list.size() > 1 ? zzhVar.b(list.get(1)).d().doubleValue() : str9.length());
                if (a3 < 0.0d) {
                    min2 = Math.max(str9.length() + a3, 0.0d);
                } else {
                    min2 = Math.min(a3, str9.length());
                }
                return new zzas(str9.substring(i5, Math.max(0, ((int) min2) - i5) + i5));
            case '\r':
                zzg.n("split", 2, list);
                String str10 = this.X;
                if (str10.length() == 0) {
                    return new zzaf(this);
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String e4 = zzhVar.b(list.get(0)).e();
                    long m = list.size() > 1 ? zzg.m(zzhVar.b(list.get(1)).d().doubleValue()) : 2147483647L;
                    if (m == 0) {
                        return new zzaf();
                    }
                    String[] split = str10.split(Pattern.quote(e4), ((int) m) + 1);
                    int length2 = split.length;
                    if (!e4.isEmpty() || split.length <= 0) {
                        i2 = 0;
                    } else {
                        boolean isEmpty = split[0].isEmpty();
                        i2 = isEmpty;
                        if (split[split.length - 1].isEmpty()) {
                            length2 = split.length - 1;
                            i2 = isEmpty;
                        }
                    }
                    if (split.length > m) {
                        length2--;
                    }
                    while (i2 < length2) {
                        arrayList.add(new zzas(split[i2]));
                        i2++;
                    }
                }
                return new zzaf(arrayList);
            case 14:
                zzg.n("substring", 2, list);
                String str11 = this.X;
                int a4 = !list.isEmpty() ? (int) zzg.a(zzhVar.b(list.get(0)).d().doubleValue()) : 0;
                if (list.size() > 1) {
                    length = (int) zzg.a(zzhVar.b(list.get(1)).d().doubleValue());
                } else {
                    length = str11.length();
                }
                int min3 = Math.min(Math.max(a4, 0), str11.length());
                int min4 = Math.min(Math.max(length, 0), str11.length());
                return new zzas(str11.substring(Math.min(min3, min4), Math.max(min3, min4)));
            case 15:
                zzasVar = this;
                zzg.n("replace", 2, list);
                zzaq zzaqVar = zzaq.i;
                String e5 = zzaqVar.e();
                if (!list.isEmpty()) {
                    e5 = zzhVar.b(list.get(0)).e();
                    if (list.size() > 1) {
                        zzaqVar = zzhVar.b(list.get(1));
                    }
                }
                String str12 = zzasVar.X;
                int indexOf = str12.indexOf(e5);
                if (indexOf >= 0) {
                    if (zzaqVar instanceof zzal) {
                        i3 = 0;
                        zzaqVar = ((zzal) zzaqVar).a(zzhVar, Arrays.asList(new zzas(e5), new zzai(Double.valueOf(indexOf)), zzasVar));
                    } else {
                        i3 = 0;
                    }
                    return new zzas(str12.substring(i3, indexOf) + zzaqVar.e() + str12.substring(indexOf + e5.length()));
                }
                break;
            case 16:
                zzg.n("indexOf", 2, list);
                String str13 = this.X;
                if (list.size() <= 0) {
                    e3 = zzaq.i.e();
                    zzhVar2 = zzhVar;
                } else {
                    zzhVar2 = zzhVar;
                    e3 = zzhVar2.b(list.get(0)).e();
                }
                return new zzai(Double.valueOf(str13.indexOf(e3, (int) zzg.a(list.size() >= 2 ? zzhVar2.b(list.get(1)).d().doubleValue() : 0.0d))));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
        return zzasVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzau(this);
    }

    public final String toString() {
        String str = this.X;
        return AbstractC4253Sp2.b.x1 + str + AbstractC4253Sp2.b.x1;
    }
}
