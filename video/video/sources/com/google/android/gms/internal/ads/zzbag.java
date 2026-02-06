package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import o.C4500Ve2;

/* loaded from: classes2.dex */
public final class zzbag {
    public final zzazv a;
    public final int b;
    public final int c;

    public zzbag(int i, int i2, int i3) {
        this.b = i;
        i2 = (i2 > 64 || i2 < 0) ? 64 : i2;
        if (i3 <= 0) {
            this.c = 1;
        } else {
            this.c = i3;
        }
        this.a = new zzbae(i2);
    }

    public final String a(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        Collections.sort(arrayList2, new zzbaf(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i = 0; i < arrayList2.size(); i++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((zzazu) arrayList2.get(i)).e()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str2 : split) {
                    if (str2.contains("'")) {
                        StringBuilder sb = new StringBuilder(str2);
                        int i2 = 1;
                        boolean z = false;
                        while (true) {
                            int i3 = i2 + 2;
                            if (i3 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i2) == '\'') {
                                if (sb.charAt(i2 - 1) != ' ') {
                                    int i4 = i2 + 1;
                                    if ((sb.charAt(i4) == 's' || sb.charAt(i4) == 'S') && (i3 == sb.length() || sb.charAt(i3) == ' ')) {
                                        sb.insert(i2, ' ');
                                        i2 = i3;
                                        z = true;
                                    }
                                }
                                sb.setCharAt(i2, ' ');
                                z = true;
                            }
                            i2++;
                        }
                        if (z) {
                            str = sb.toString();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            str2 = str;
                        }
                    }
                    String[] b = zzazz.b(str2, true);
                    int length = b.length;
                    int i5 = this.c;
                    if (length >= i5) {
                        for (int i6 = 0; i6 < b.length; i6++) {
                            String str3 = "";
                            for (int i7 = 0; i7 < i5; i7++) {
                                int i8 = i6 + i7;
                                if (i8 >= b.length) {
                                    break;
                                }
                                if (i7 > 0) {
                                    str3 = str3.concat(C4500Ve2.b);
                                }
                                str3 = str3.concat(String.valueOf(b[i8]));
                            }
                            hashSet.add(str3);
                            if (hashSet.size() >= this.b) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.b) {
                            break loop0;
                        }
                    }
                }
                continue;
            }
        }
        zzazx zzazxVar = new zzazx();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzazxVar.b.write(this.a.b((String) it.next()));
            } catch (IOException e) {
                int i9 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Error while writing hash to byteStream", e);
            }
        }
        return zzazxVar.toString();
    }
}
