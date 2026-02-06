package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import o.C2531Be;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public final class zzgk {
    @InterfaceC8710pF0("PhenotypeConstants.class")
    public static final C2531Be<String, Uri> a = new C2531Be<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (zzgk.class) {
            C2531Be<String, Uri> c2531Be = a;
            uri = c2531Be.get(str);
            if (uri == null) {
                String encode = Uri.encode(str);
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + encode);
                c2531Be.put(str, uri);
            }
        }
        return uri;
    }

    public static String b(Context context, String str) {
        if (!str.contains("#")) {
            String packageName = context.getPackageName();
            return str + "#" + packageName;
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
    }
}
