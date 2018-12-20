using System;

namespace SingletonPattern
{
    /// <summary>
    /// Using .NET 4's Lazy<T> type
    /// </summary>
    public sealed class LTSingleton
    {
        private static readonly Lazy<LTSingleton> lazy =
            new Lazy<LTSingleton>(() => new LTSingleton());

        public static LTSingleton Instance { get { return lazy.Value; } }

        private LTSingleton()
        {
        }
    }
}
