package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfmb {
    public static final Pattern b = Pattern.compile("^[a-zA-Z0-9 ]+$");
    public final List a = new ArrayList();

    public final List a() {
        return this.a;
    }

    public final void b(View view, zzfli zzfliVar, @InterfaceC11300zs1 String str) {
        zzfma zzfmaVar;
        if (view != null) {
            if (b.matcher("Ad overlay").matches()) {
                List list = this.a;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        zzfmaVar = (zzfma) it.next();
                        if (zzfmaVar.b().get() == view) {
                            break;
                        }
                    } else {
                        zzfmaVar = null;
                        break;
                    }
                }
                if (zzfmaVar == null) {
                    list.add(new zzfma(view, zzfliVar, "Ad overlay"));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        throw new IllegalArgumentException("FriendlyObstruction is null");
    }

    public final void c() {
        this.a.clear();
    }
}
