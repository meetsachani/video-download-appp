package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzln implements Comparable<zzln>, Map.Entry<Object, Object> {
    public final Object X;
    public Object Y;
    public final /* synthetic */ zzlg Z;

    public zzln(zzlg zzlgVar, Map.Entry<Object, Object> entry) {
        this(zzlgVar, (Comparable) entry.getKey(), entry.getValue());
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzln zzlnVar) {
        return ((Comparable) getKey()).compareTo((Comparable) zzlnVar.getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (e(this.X, entry.getKey()) && e(this.Y, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.X;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.Y;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Object obj = this.X;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.Y;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.Z.u();
        Object obj2 = this.Y;
        this.Y = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.X);
        String valueOf2 = String.valueOf(this.Y);
        return valueOf + "=" + valueOf2;
    }

    public zzln(zzlg zzlgVar, Object obj, Object obj2) {
        this.Z = zzlgVar;
        this.X = obj;
        this.Y = obj2;
    }
}
