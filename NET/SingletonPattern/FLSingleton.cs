namespace SingletonPattern
{
    /// <summary>
    /// Fully Lazy Instantiation
    /// </summary>
    public sealed class FLSingleton
    {
        private FLSingleton()
        {
        }

        public static FLSingleton Instance { get { return Nested.instance; } }

        private class Nested
        {
            // Explicit static constructor to tell C# compiler
            // not to mark type as beforefieldinit
            static Nested()
            {
            }

            internal static readonly FLSingleton instance = new FLSingleton();
        }
    }
}
