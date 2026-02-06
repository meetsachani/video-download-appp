package com.google.firebase.sessions;

import o.C6562gT0;
import o.C9516sY;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class DataCollectionStatus {
    @NotNull
    public final DataCollectionState a;
    @NotNull
    public final DataCollectionState b;
    public final double c;

    public DataCollectionStatus() {
        this(null, null, 0.0d, 7, null);
    }

    public static /* synthetic */ DataCollectionStatus e(DataCollectionStatus dataCollectionStatus, DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            dataCollectionState = dataCollectionStatus.a;
        }
        if ((i & 2) != 0) {
            dataCollectionState2 = dataCollectionStatus.b;
        }
        if ((i & 4) != 0) {
            d = dataCollectionStatus.c;
        }
        return dataCollectionStatus.d(dataCollectionState, dataCollectionState2, d);
    }

    @NotNull
    public final DataCollectionState a() {
        return this.a;
    }

    @NotNull
    public final DataCollectionState b() {
        return this.b;
    }

    public final double c() {
        return this.c;
    }

    @NotNull
    public final DataCollectionStatus d(@NotNull DataCollectionState dataCollectionState, @NotNull DataCollectionState dataCollectionState2, double d) {
        C6562gT0.p(dataCollectionState, "performance");
        C6562gT0.p(dataCollectionState2, "crashlytics");
        return new DataCollectionStatus(dataCollectionState, dataCollectionState2, d);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataCollectionStatus) {
            DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) obj;
            return this.a == dataCollectionStatus.a && this.b == dataCollectionStatus.b && C6562gT0.g(Double.valueOf(this.c), Double.valueOf(dataCollectionStatus.c));
        }
        return false;
    }

    @NotNull
    public final DataCollectionState f() {
        return this.b;
    }

    @NotNull
    public final DataCollectionState g() {
        return this.a;
    }

    public final double h() {
        return this.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Double.hashCode(this.c);
    }

    @NotNull
    public String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }

    public DataCollectionStatus(@NotNull DataCollectionState dataCollectionState, @NotNull DataCollectionState dataCollectionState2, double d) {
        C6562gT0.p(dataCollectionState, "performance");
        C6562gT0.p(dataCollectionState2, "crashlytics");
        this.a = dataCollectionState;
        this.b = dataCollectionState2;
        this.c = d;
    }

    public /* synthetic */ DataCollectionStatus(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d, int i, C9516sY c9516sY) {
        this((i & 1) != 0 ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : dataCollectionState, (i & 2) != 0 ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : dataCollectionState2, (i & 4) != 0 ? 1.0d : d);
    }
}
