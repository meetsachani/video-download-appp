package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class zzdg extends zzdk {
    public final Object X;
    public boolean Y;

    public zzdg(Object obj) {
        this.X = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.Y;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.Y) {
            this.Y = true;
            return this.X;
        }
        throw new NoSuchElementException();
    }
}
