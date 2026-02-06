package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C10928yK2;
import o.C4500Ve2;
import o.C5445bv2;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzamd {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpannedString a(@InterfaceC11300zs1 String str, String str2, List list) {
        boolean z;
        int i;
        char c2;
        char c3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str2.length()) {
            int i3 = i2 + 1;
            char charAt = str2.charAt(i2);
            if (charAt != '&') {
                if (charAt != '<') {
                    spannableStringBuilder.append(charAt);
                } else if (i3 < str2.length()) {
                    char charAt2 = str2.charAt(i3);
                    int indexOf = str2.indexOf(62, i3);
                    if (indexOf == -1) {
                        i3 = str2.length();
                    } else {
                        i3 = indexOf + 1;
                    }
                    int i4 = i3 - 2;
                    if (str2.charAt(i4) == '/') {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (charAt2 == '/') {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    int i5 = i2 + i;
                    if (!z) {
                        i4 = i3 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    if (!substring.trim().isEmpty()) {
                        String trim = substring.trim();
                        zzdc.d(!trim.isEmpty());
                        String str3 = zzeu.a;
                        String str4 = trim.split("[ \\.]", 2)[0];
                        int hashCode = str4.hashCode();
                        if (hashCode != 98) {
                            if (hashCode != 99) {
                                if (hashCode != 105) {
                                    if (hashCode != 3650) {
                                        if (hashCode != 3314158) {
                                            if (hashCode != 3511770) {
                                                if (hashCode != 117) {
                                                    if (hashCode == 118 && str4.equals("v")) {
                                                        c2 = 7;
                                                        switch (c2) {
                                                            case 0:
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                                if (charAt2 == '/') {
                                                                    while (!arrayDeque.isEmpty()) {
                                                                        zzalz zzalzVar = (zzalz) arrayDeque.pop();
                                                                        g(str, zzalzVar, arrayList, spannableStringBuilder, list);
                                                                        if (!arrayDeque.isEmpty()) {
                                                                            arrayList.add(new zzaly(zzalzVar, spannableStringBuilder.length(), null));
                                                                        } else {
                                                                            arrayList.clear();
                                                                        }
                                                                        if (zzalzVar.a.equals(str4)) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                                } else if (!z) {
                                                                    arrayDeque.push(zzalz.a(substring, spannableStringBuilder.length()));
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    c2 = 65535;
                                                    switch (c2) {
                                                    }
                                                } else {
                                                    if (str4.equals("u")) {
                                                        c2 = 6;
                                                        switch (c2) {
                                                        }
                                                    }
                                                    c2 = 65535;
                                                    switch (c2) {
                                                    }
                                                }
                                            } else {
                                                if (str4.equals("ruby")) {
                                                    c2 = 4;
                                                    switch (c2) {
                                                    }
                                                }
                                                c2 = 65535;
                                                switch (c2) {
                                                }
                                            }
                                        } else {
                                            if (str4.equals(C10928yK2.u)) {
                                                c2 = 3;
                                                switch (c2) {
                                                }
                                            }
                                            c2 = 65535;
                                            switch (c2) {
                                            }
                                        }
                                    } else {
                                        if (str4.equals(C10928yK2.w)) {
                                            c2 = 5;
                                            switch (c2) {
                                            }
                                        }
                                        c2 = 65535;
                                        switch (c2) {
                                        }
                                    }
                                } else {
                                    if (str4.equals("i")) {
                                        c2 = 2;
                                        switch (c2) {
                                        }
                                    }
                                    c2 = 65535;
                                    switch (c2) {
                                    }
                                }
                            } else {
                                if (str4.equals("c")) {
                                    c2 = 1;
                                    switch (c2) {
                                    }
                                }
                                c2 = 65535;
                                switch (c2) {
                                }
                            }
                        } else {
                            if (str4.equals("b")) {
                                c2 = 0;
                                switch (c2) {
                                }
                            }
                            c2 = 65535;
                            switch (c2) {
                            }
                        }
                    }
                }
            } else {
                int indexOf2 = str2.indexOf(59, i3);
                int indexOf3 = str2.indexOf(32, i3);
                if (indexOf2 == -1) {
                    indexOf2 = indexOf3;
                } else if (indexOf3 != -1) {
                    indexOf2 = Math.min(indexOf2, indexOf3);
                }
                if (indexOf2 != -1) {
                    String substring2 = str2.substring(i3, indexOf2);
                    int hashCode2 = substring2.hashCode();
                    if (hashCode2 != 3309) {
                        if (hashCode2 != 3464) {
                            if (hashCode2 != 96708) {
                                if (hashCode2 == 3374865 && substring2.equals(C10928yK2.q)) {
                                    c3 = 2;
                                    if (c3 == 0) {
                                        if (c3 != 1) {
                                            if (c3 != 2) {
                                                if (c3 != 3) {
                                                    zzdx.f(C10928yK2.C, "ignoring unsupported entity: '&" + substring2 + ";'");
                                                } else {
                                                    spannableStringBuilder.append('&');
                                                }
                                            } else {
                                                spannableStringBuilder.append(' ');
                                            }
                                        } else {
                                            spannableStringBuilder.append('>');
                                        }
                                    } else {
                                        spannableStringBuilder.append('<');
                                    }
                                    if (indexOf2 == indexOf3) {
                                        spannableStringBuilder.append((CharSequence) C4500Ve2.b);
                                    }
                                    i2 = indexOf2 + 1;
                                }
                                c3 = 65535;
                                if (c3 == 0) {
                                }
                                if (indexOf2 == indexOf3) {
                                }
                                i2 = indexOf2 + 1;
                            } else {
                                if (substring2.equals(C10928yK2.p)) {
                                    c3 = 3;
                                    if (c3 == 0) {
                                    }
                                    if (indexOf2 == indexOf3) {
                                    }
                                    i2 = indexOf2 + 1;
                                }
                                c3 = 65535;
                                if (c3 == 0) {
                                }
                                if (indexOf2 == indexOf3) {
                                }
                                i2 = indexOf2 + 1;
                            }
                        } else {
                            if (substring2.equals(C10928yK2.n)) {
                                c3 = 0;
                                if (c3 == 0) {
                                }
                                if (indexOf2 == indexOf3) {
                                }
                                i2 = indexOf2 + 1;
                            }
                            c3 = 65535;
                            if (c3 == 0) {
                            }
                            if (indexOf2 == indexOf3) {
                            }
                            i2 = indexOf2 + 1;
                        }
                    } else {
                        if (substring2.equals(C10928yK2.f915o)) {
                            c3 = 1;
                            if (c3 == 0) {
                            }
                            if (indexOf2 == indexOf3) {
                            }
                            i2 = indexOf2 + 1;
                        }
                        c3 = 65535;
                        if (c3 == 0) {
                        }
                        if (indexOf2 == indexOf3) {
                        }
                        i2 = indexOf2 + 1;
                    }
                } else {
                    spannableStringBuilder.append(charAt);
                }
            }
            i2 = i3;
        }
        while (!arrayDeque.isEmpty()) {
            g(str, (zzalz) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        g(str, zzalz.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static zzcs b(String str) {
        zzamb zzambVar = new zzamb();
        h(str, zzambVar);
        return zzambVar.a();
    }

    @InterfaceC11300zs1
    public static zzalw c(zzek zzekVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String T = zzekVar.T(charset);
        if (T != null) {
            Pattern pattern = a;
            Matcher matcher = pattern.matcher(T);
            if (!matcher.matches()) {
                String T2 = zzekVar.T(charset);
                if (T2 != null) {
                    Matcher matcher2 = pattern.matcher(T2);
                    if (matcher2.matches()) {
                        return e(T.trim(), matcher2, zzekVar, list);
                    }
                }
            } else {
                return e(null, matcher, zzekVar, list);
            }
        }
        return null;
    }

    public static int d(List list, @InterfaceC11300zs1 String str, zzalz zzalzVar) {
        List f = f(list, str, zzalzVar);
        for (int i = 0; i < f.size(); i++) {
            zzalv zzalvVar = ((zzama) f.get(i)).Y;
            if (zzalvVar.f() != -1) {
                return zzalvVar.f();
            }
        }
        return -1;
    }

    @InterfaceC11300zs1
    public static zzalw e(@InterfaceC11300zs1 String str, Matcher matcher, zzek zzekVar, List list) {
        zzamb zzambVar = new zzamb();
        try {
            String group = matcher.group(1);
            if (group != null) {
                zzambVar.a = zzamf.b(group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    zzambVar.b = zzamf.b(group2);
                    String group3 = matcher.group(3);
                    group3.getClass();
                    h(group3, zzambVar);
                    StringBuilder sb = new StringBuilder();
                    String T = zzekVar.T(StandardCharsets.UTF_8);
                    while (!TextUtils.isEmpty(T)) {
                        if (sb.length() > 0) {
                            sb.append("\n");
                        }
                        sb.append(T.trim());
                        T = zzekVar.T(StandardCharsets.UTF_8);
                    }
                    zzambVar.c = a(str, sb.toString(), list);
                    return new zzalw(zzambVar.a().p(), zzambVar.a, zzambVar.b);
                }
                throw null;
            }
            throw null;
        } catch (IllegalArgumentException unused) {
            zzdx.f(C10928yK2.C, "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    public static List f(List list, @InterfaceC11300zs1 String str, zzalz zzalzVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzalv zzalvVar = (zzalv) list.get(i);
            int g = zzalvVar.g(str, zzalzVar.a, zzalzVar.d, zzalzVar.c);
            if (g > 0) {
                arrayList.add(new zzama(g, zzalvVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void g(@InterfaceC11300zs1 String str, zzalz zzalzVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c2;
        Comparator comparator;
        zzalz zzalzVar2;
        zzalz zzalzVar3;
        zzalz zzalzVar4;
        int i;
        int i2 = zzalzVar.b;
        int length = spannableStringBuilder.length();
        String str2 = zzalzVar.a;
        int hashCode = str2.hashCode();
        int i3 = -1;
        if (hashCode != 0) {
            if (hashCode != 105) {
                if (hashCode != 3314158) {
                    if (hashCode != 3511770) {
                        if (hashCode != 98) {
                            if (hashCode != 99) {
                                if (hashCode != 117) {
                                    if (hashCode == 118 && str2.equals("v")) {
                                        c2 = 5;
                                    }
                                    c2 = 65535;
                                } else {
                                    if (str2.equals("u")) {
                                        c2 = 3;
                                    }
                                    c2 = 65535;
                                }
                            } else {
                                if (str2.equals("c")) {
                                    c2 = 4;
                                }
                                c2 = 65535;
                            }
                        } else {
                            if (str2.equals("b")) {
                                c2 = 0;
                            }
                            c2 = 65535;
                        }
                    } else {
                        if (str2.equals("ruby")) {
                            c2 = 2;
                        }
                        c2 = 65535;
                    }
                } else {
                    if (str2.equals(C10928yK2.u)) {
                        c2 = 6;
                    }
                    c2 = 65535;
                }
            } else {
                if (str2.equals("i")) {
                    c2 = 1;
                }
                c2 = 65535;
            }
        } else {
            if (str2.equals("")) {
                c2 = 7;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case 2:
                int d2 = d(list2, str, zzalzVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                comparator = zzaly.c;
                Collections.sort(arrayList, comparator);
                int i4 = i2;
                int i5 = 0;
                int i6 = 0;
                while (i5 < arrayList.size()) {
                    zzalzVar2 = ((zzaly) arrayList.get(i5)).a;
                    if (C10928yK2.w.equals(zzalzVar2.a)) {
                        zzaly zzalyVar = (zzaly) arrayList.get(i5);
                        zzalzVar3 = zzalyVar.a;
                        int d3 = d(list2, str, zzalzVar3);
                        if (d3 == i3) {
                            if (d2 != i3) {
                                d3 = d2;
                            } else {
                                d3 = 1;
                            }
                        }
                        zzalzVar4 = zzalyVar.a;
                        int i7 = zzalzVar4.b - i6;
                        i = zzalyVar.b;
                        int i8 = i - i6;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i7, i8);
                        spannableStringBuilder.delete(i7, i8);
                        spannableStringBuilder.setSpan(new zzcy(subSequence.toString(), d3), i4, i7, 33);
                        i6 += subSequence.length();
                        i4 = i7;
                    }
                    i5++;
                    i3 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case 4:
                for (String str3 : zzalzVar.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i2, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i2, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new zzdb(zzalzVar.c), i2, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List f = f(list2, str, zzalzVar);
        for (int i9 = 0; i9 < f.size(); i9++) {
            zzalv zzalvVar = ((zzama) f.get(i9)).Y;
            if (zzalvVar != null) {
                if (zzalvVar.h() != -1) {
                    zzcz.b(spannableStringBuilder, new StyleSpan(zzalvVar.h()), i2, length, 33);
                }
                if (zzalvVar.A()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                }
                if (zzalvVar.z()) {
                    zzcz.b(spannableStringBuilder, new ForegroundColorSpan(zzalvVar.d()), i2, length, 33);
                }
                if (zzalvVar.y()) {
                    zzcz.b(spannableStringBuilder, new BackgroundColorSpan(zzalvVar.c()), i2, length, 33);
                }
                if (zzalvVar.s() != null) {
                    zzcz.b(spannableStringBuilder, new TypefaceSpan(zzalvVar.s()), i2, length, 33);
                }
                int e = zzalvVar.e();
                if (e != 1) {
                    if (e != 2) {
                        if (e == 3) {
                            zzcz.b(spannableStringBuilder, new RelativeSizeSpan(zzalvVar.b() / 100.0f), i2, length, 33);
                        }
                    } else {
                        zzcz.b(spannableStringBuilder, new RelativeSizeSpan(zzalvVar.b()), i2, length, 33);
                    }
                } else {
                    zzcz.b(spannableStringBuilder, new AbsoluteSizeSpan((int) zzalvVar.b(), true), i2, length, 33);
                }
                if (zzalvVar.x()) {
                    spannableStringBuilder.setSpan(new zzcx(), i2, length, 33);
                }
            }
        }
    }

    public static void h(String str, zzamb zzambVar) {
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            int i2 = 2;
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                char c2 = 65535;
                if (!"line".equals(group)) {
                    if (!"align".equals(group)) {
                        if (!"position".equals(group)) {
                            if ("size".equals(group)) {
                                zzambVar.j = zzamf.a(group2);
                            } else if (!"vertical".equals(group)) {
                                zzdx.f(C10928yK2.C, "Unknown cue setting " + group + ":" + group2);
                            } else {
                                int hashCode = group2.hashCode();
                                if (hashCode != 3462) {
                                    if (hashCode == 3642 && group2.equals("rl")) {
                                        c2 = 0;
                                    }
                                } else if (group2.equals("lr")) {
                                    c2 = 1;
                                }
                                if (c2 != 0) {
                                    if (c2 != 1) {
                                        zzdx.f(C10928yK2.C, "Invalid 'vertical' value: ".concat(group2));
                                        i = Integer.MIN_VALUE;
                                    } else {
                                        i = 2;
                                    }
                                }
                                zzambVar.k = i;
                            }
                        } else {
                            int indexOf = group2.indexOf(44);
                            if (indexOf != -1) {
                                String substring = group2.substring(indexOf + 1);
                                switch (substring.hashCode()) {
                                    case -1842484672:
                                        if (substring.equals("line-left")) {
                                            c2 = 0;
                                            break;
                                        }
                                        break;
                                    case -1364013995:
                                        if (substring.equals(C5445bv2.m0)) {
                                            c2 = 2;
                                            break;
                                        }
                                        break;
                                    case -1276788989:
                                        if (substring.equals("line-right")) {
                                            c2 = 4;
                                            break;
                                        }
                                        break;
                                    case -1074341483:
                                        if (substring.equals("middle")) {
                                            c2 = 3;
                                            break;
                                        }
                                        break;
                                    case 100571:
                                        if (substring.equals("end")) {
                                            c2 = 5;
                                            break;
                                        }
                                        break;
                                    case 109757538:
                                        if (substring.equals("start")) {
                                            c2 = 1;
                                            break;
                                        }
                                        break;
                                }
                                if (c2 != 0 && c2 != 1) {
                                    if (c2 != 2 && c2 != 3) {
                                        if (c2 != 4 && c2 != 5) {
                                            zzdx.f(C10928yK2.C, "Invalid anchor value: ".concat(substring));
                                            i = Integer.MIN_VALUE;
                                        } else {
                                            i = 2;
                                        }
                                    }
                                } else {
                                    i = 0;
                                }
                                zzambVar.i = i;
                                group2 = group2.substring(0, indexOf);
                            }
                            zzambVar.h = zzamf.a(group2);
                        }
                    } else {
                        switch (group2.hashCode()) {
                            case -1364013995:
                                if (group2.equals(C5445bv2.m0)) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (group2.equals("middle")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (group2.equals("end")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (group2.equals("left")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (group2.equals(C5445bv2.n0)) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (group2.equals("start")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c2 != 0) {
                            if (c2 != 1) {
                                if (c2 != 2 && c2 != 3) {
                                    if (c2 != 4) {
                                        if (c2 != 5) {
                                            zzdx.f(C10928yK2.C, "Invalid alignment value: ".concat(group2));
                                        } else {
                                            i = 5;
                                        }
                                    } else {
                                        i = 3;
                                    }
                                }
                                i = 2;
                            } else {
                                i = 4;
                            }
                        }
                        zzambVar.d = i;
                    }
                } else {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1364013995:
                                if (substring2.equals(C5445bv2.m0)) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring2.equals("start")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c2 != 0) {
                            if (c2 != 1 && c2 != 2) {
                                if (c2 != 3) {
                                    zzdx.f(C10928yK2.C, "Invalid anchor value: ".concat(substring2));
                                    i2 = Integer.MIN_VALUE;
                                }
                            } else {
                                i2 = 1;
                            }
                        } else {
                            i2 = 0;
                        }
                        zzambVar.g = i2;
                        group2 = group2.substring(0, indexOf2);
                    }
                    if (group2.endsWith("%")) {
                        zzambVar.e = zzamf.a(group2);
                        zzambVar.f = 0;
                    } else {
                        zzambVar.e = Integer.parseInt(group2);
                        zzambVar.f = 1;
                    }
                }
            } catch (NumberFormatException unused) {
                zzdx.f(C10928yK2.C, "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
