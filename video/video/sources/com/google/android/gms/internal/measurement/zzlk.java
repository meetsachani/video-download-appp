package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlk extends zzls {
    public final /* synthetic */ zzlg Y;

    @Override // com.google.android.gms.internal.measurement.zzls, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<Object, Object>> iterator() {
        return new zzli(this.Y);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlk(zzlg zzlgVar) {
        super(zzlgVar);
        this.Y = zzlgVar;
    }
}
