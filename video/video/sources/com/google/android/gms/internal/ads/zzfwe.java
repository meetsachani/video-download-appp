package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
class zzfwe extends zzfwv implements zzfyn {
    public zzfwe(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzfwv
    public /* bridge */ /* synthetic */ Collection h() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwv
    public final Collection i(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzfwv
    public final Collection j(Object obj, Collection collection) {
        return l(obj, (List) collection, null);
    }
}
