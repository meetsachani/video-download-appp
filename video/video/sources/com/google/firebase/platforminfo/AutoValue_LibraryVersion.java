package com.google.firebase.platforminfo;

import o.InterfaceC7866lr1;

/* loaded from: classes3.dex */
final class AutoValue_LibraryVersion extends LibraryVersion {
    public final String a;
    public final String b;

    public AutoValue_LibraryVersion(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    @InterfaceC7866lr1
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersion
    @InterfaceC7866lr1
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LibraryVersion) {
            LibraryVersion libraryVersion = (LibraryVersion) obj;
            if (this.a.equals(libraryVersion.b()) && this.b.equals(libraryVersion.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }
}
