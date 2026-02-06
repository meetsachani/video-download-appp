package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzhgh implements zzhfv {
    public final List a;
    public final List b;

    static {
        zzhfw.a(Collections.EMPTY_SET);
    }

    public /* synthetic */ zzhgh(List list, List list2, zzhgf zzhgfVar) {
        this.a = list;
        this.b = list2;
    }

    public static zzhgg a(int i, int i2) {
        return new zzhgg(i, i2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: c */
    public final Set b() {
        List list = this.a;
        int size = list.size();
        List list2 = this.b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((zzhge) list2.get(i)).b();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet a = zzhfs.a(size);
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object b = ((zzhge) list.get(i2)).b();
            b.getClass();
            a.add(b);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                a.add(obj);
            }
        }
        return Collections.unmodifiableSet(a);
    }
}
