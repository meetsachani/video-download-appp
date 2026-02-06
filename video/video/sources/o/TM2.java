package o;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class TM2 {
    public UUID a;
    public a b;
    public androidx.work.b c;
    public Set<String> d;
    public androidx.work.b e;
    public int f;

    /* loaded from: classes.dex */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean e() {
            if (this != SUCCEEDED && this != FAILED && this != CANCELLED) {
                return false;
            }
            return true;
        }
    }

    public TM2(UUID id, a state, androidx.work.b outputData, List<String> tags, androidx.work.b progress, int runAttemptCount) {
        this.a = id;
        this.b = state;
        this.c = outputData;
        this.d = new HashSet(tags);
        this.e = progress;
        this.f = runAttemptCount;
    }

    public UUID a() {
        return this.a;
    }

    public androidx.work.b b() {
        return this.c;
    }

    public androidx.work.b c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public a e() {
        return this.b;
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || TM2.class != o2.getClass()) {
            return false;
        }
        TM2 tm2 = (TM2) o2;
        if (this.f != tm2.f || !this.a.equals(tm2.a) || this.b != tm2.b || !this.c.equals(tm2.c) || !this.d.equals(tm2.d)) {
            return false;
        }
        return this.e.equals(tm2.e);
    }

    public Set<String> f() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.a + "', mState=" + this.b + ", mOutputData=" + this.c + ", mTags=" + this.d + ", mProgress=" + this.e + '}';
    }
}
