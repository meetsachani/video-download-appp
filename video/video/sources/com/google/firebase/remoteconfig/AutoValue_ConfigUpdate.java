package com.google.firebase.remoteconfig;

import java.util.Set;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class AutoValue_ConfigUpdate extends ConfigUpdate {
    public final Set<String> a;

    public AutoValue_ConfigUpdate(Set<String> set) {
        if (set != null) {
            this.a = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdate
    @InterfaceC5670cr1
    public Set<String> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigUpdate) {
            return this.a.equals(((ConfigUpdate) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.a + "}";
    }
}
