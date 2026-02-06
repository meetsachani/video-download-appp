package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
final class zzfwt extends zzfwr implements ListIterator {
    public final /* synthetic */ zzfwu Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwt(zzfwu zzfwuVar) {
        super(zzfwuVar);
        this.Y0 = zzfwuVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        zzfwu zzfwuVar = this.Y0;
        boolean isEmpty = zzfwuVar.isEmpty();
        b();
        ((ListIterator) this.X).add(obj);
        zzfwv zzfwvVar = zzfwuVar.a1;
        i = zzfwvVar.Z0;
        zzfwvVar.Z0 = i + 1;
        if (isEmpty) {
            zzfwuVar.d();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.X).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((ListIterator) this.X).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        return ((ListIterator) this.X).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((ListIterator) this.X).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        ((ListIterator) this.X).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwt(zzfwu zzfwuVar, int i) {
        super(zzfwuVar, ((List) zzfwuVar.Y).listIterator(i));
        this.Y0 = zzfwuVar;
    }
}
