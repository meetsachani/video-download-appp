package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import o.C6566gU0;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC6181ey;

@KeepForSdk
/* loaded from: classes2.dex */
public final class Objects {

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static final class ToStringHelper {
        public final List a;
        public final Object b;

        public /* synthetic */ ToStringHelper(Object obj, zzai zzaiVar) {
            Preconditions.r(obj);
            this.b = obj;
            this.a = new ArrayList();
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        @KeepForSdk
        public ToStringHelper a(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 Object obj) {
            Preconditions.r(str);
            String valueOf = String.valueOf(obj);
            this.a.add(str + "=" + valueOf);
            return this;
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append('{');
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.a.get(i));
                if (i < size - 1) {
                    sb.append(C6566gU0.h);
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static boolean a(@InterfaceC5670cr1 Bundle bundle, @InterfaceC5670cr1 Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            Set<String> keySet = bundle.keySet();
            if (!keySet.containsAll(bundle2.keySet())) {
                return false;
            }
            for (String str : keySet) {
                if (!b(bundle.get(str), bundle2.get(str))) {
                    return false;
                }
            }
            return true;
        } else if (bundle == bundle2) {
            return true;
        } else {
            return false;
        }
    }

    @KeepForSdk
    public static boolean b(@InterfaceC11300zs1 Object obj, @InterfaceC11300zs1 Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static int c(@InterfaceC5670cr1 Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static ToStringHelper d(@InterfaceC5670cr1 Object obj) {
        return new ToStringHelper(obj, null);
    }
}
