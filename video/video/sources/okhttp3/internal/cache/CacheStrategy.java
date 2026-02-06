package okhttp3.internal.cache;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import o.AI0;
import o.C6562gT0;
import o.C9516sY;
import o.C9545sf2;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class CacheStrategy {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private final Response cacheResponse;
    @Nullable
    private final Request networkRequest;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        public final boolean isCacheable(@NotNull Response response, @NotNull Request request) {
            C6562gT0.p(response, "response");
            C6562gT0.p(request, "request");
            int code = response.code();
            if (code != 200 && code != 410 && code != 414 && code != 501 && code != 203 && code != 204) {
                if (code != 307) {
                    if (code != 308 && code != 404 && code != 405) {
                        switch (code) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (Response.header$default(response, "Expires", null, 2, null) == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().isPublic() && !response.cacheControl().isPrivate()) {
                    return false;
                }
            }
            if (response.cacheControl().noStore() || request.cacheControl().noStore()) {
                return false;
            }
            return true;
        }

        private Companion() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class Factory {
        private int ageSeconds;
        @Nullable
        private final Response cacheResponse;
        @Nullable
        private String etag;
        @Nullable
        private Date expires;
        @Nullable
        private Date lastModified;
        @Nullable
        private String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;
        @NotNull
        private final Request request;
        private long sentRequestMillis;
        @Nullable
        private Date servedDate;
        @Nullable
        private String servedDateString;

        public Factory(long j, @NotNull Request request, @Nullable Response response) {
            C6562gT0.p(request, "request");
            this.nowMillis = j;
            this.request = request;
            this.cacheResponse = response;
            this.ageSeconds = -1;
            if (response != null) {
                this.sentRequestMillis = response.sentRequestAtMillis();
                this.receivedResponseMillis = response.receivedResponseAtMillis();
                Headers headers = response.headers();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String name = headers.name(i);
                    String value = headers.value(i);
                    if (C9545sf2.c2(name, "Date", true)) {
                        this.servedDate = DatesKt.toHttpDateOrNull(value);
                        this.servedDateString = value;
                    } else if (C9545sf2.c2(name, "Expires", true)) {
                        this.expires = DatesKt.toHttpDateOrNull(value);
                    } else if (C9545sf2.c2(name, AI0.r0, true)) {
                        this.lastModified = DatesKt.toHttpDateOrNull(value);
                        this.lastModifiedString = value;
                    } else if (C9545sf2.c2(name, "ETag", true)) {
                        this.etag = value;
                    } else if (C9545sf2.c2(name, AI0.Y, true)) {
                        this.ageSeconds = Util.toNonNegativeInt(value, -1);
                    }
                }
            }
        }

        private final long cacheResponseAge() {
            Date date = this.servedDate;
            long j = 0;
            if (date != null) {
                j = Math.max(0L, this.receivedResponseMillis - date.getTime());
            }
            int i = this.ageSeconds;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis(i));
            }
            long j2 = this.receivedResponseMillis;
            return j + (j2 - this.sentRequestMillis) + (this.nowMillis - j2);
        }

        private final CacheStrategy computeCandidate() {
            long j;
            String str;
            if (this.cacheResponse == null) {
                return new CacheStrategy(this.request, null);
            }
            if (this.request.isHttps() && this.cacheResponse.handshake() == null) {
                return new CacheStrategy(this.request, null);
            }
            if (!CacheStrategy.Companion.isCacheable(this.cacheResponse, this.request)) {
                return new CacheStrategy(this.request, null);
            }
            CacheControl cacheControl = this.request.cacheControl();
            if (!cacheControl.noCache() && !hasConditions(this.request)) {
                CacheControl cacheControl2 = this.cacheResponse.cacheControl();
                long cacheResponseAge = cacheResponseAge();
                long computeFreshnessLifetime = computeFreshnessLifetime();
                if (cacheControl.maxAgeSeconds() != -1) {
                    computeFreshnessLifetime = Math.min(computeFreshnessLifetime, TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
                }
                long j2 = 0;
                if (cacheControl.minFreshSeconds() != -1) {
                    j = TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds());
                } else {
                    j = 0;
                }
                if (!cacheControl2.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                    j2 = TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
                }
                if (!cacheControl2.noCache()) {
                    long j3 = j + cacheResponseAge;
                    if (j3 < j2 + computeFreshnessLifetime) {
                        Response.Builder newBuilder = this.cacheResponse.newBuilder();
                        if (j3 >= computeFreshnessLifetime) {
                            newBuilder.addHeader(AI0.g, "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (cacheResponseAge > 86400000 && isFreshnessLifetimeHeuristic()) {
                            newBuilder.addHeader(AI0.g, "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new CacheStrategy(null, newBuilder.build());
                    }
                }
                String str2 = this.etag;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.lastModified != null) {
                        str2 = this.lastModifiedString;
                    } else if (this.servedDate != null) {
                        str2 = this.servedDateString;
                    } else {
                        return new CacheStrategy(this.request, null);
                    }
                    str = AI0.z;
                }
                Headers.Builder newBuilder2 = this.request.headers().newBuilder();
                C6562gT0.m(str2);
                newBuilder2.addLenient$okhttp(str, str2);
                return new CacheStrategy(this.request.newBuilder().headers(newBuilder2.build()).build(), this.cacheResponse);
            }
            return new CacheStrategy(this.request, null);
        }

        private final long computeFreshnessLifetime() {
            long j;
            long j2;
            Response response = this.cacheResponse;
            C6562gT0.m(response);
            CacheControl cacheControl = response.cacheControl();
            if (cacheControl.maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                if (date2 != null) {
                    j2 = date2.getTime();
                } else {
                    j2 = this.receivedResponseMillis;
                }
                long time = date.getTime() - j2;
                if (time <= 0) {
                    return 0L;
                }
                return time;
            }
            if (this.lastModified != null && this.cacheResponse.request().url().query() == null) {
                Date date3 = this.servedDate;
                if (date3 != null) {
                    j = date3.getTime();
                } else {
                    j = this.sentRequestMillis;
                }
                Date date4 = this.lastModified;
                C6562gT0.m(date4);
                long time2 = j - date4.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
            }
            return 0L;
        }

        private final boolean hasConditions(Request request) {
            if (request.header(AI0.z) == null && request.header("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        private final boolean isFreshnessLifetimeHeuristic() {
            Response response = this.cacheResponse;
            C6562gT0.m(response);
            if (response.cacheControl().maxAgeSeconds() == -1 && this.expires == null) {
                return true;
            }
            return false;
        }

        @NotNull
        public final CacheStrategy compute() {
            CacheStrategy computeCandidate = computeCandidate();
            if (computeCandidate.getNetworkRequest() != null && this.request.cacheControl().onlyIfCached()) {
                return new CacheStrategy(null, null);
            }
            return computeCandidate;
        }

        @NotNull
        public final Request getRequest$okhttp() {
            return this.request;
        }
    }

    public CacheStrategy(@Nullable Request request, @Nullable Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    @Nullable
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    @Nullable
    public final Request getNetworkRequest() {
        return this.networkRequest;
    }
}
