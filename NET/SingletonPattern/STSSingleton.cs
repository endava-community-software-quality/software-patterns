namespace SingletonPattern
{
    /// <summary>
    /// Simple Thread-Safety
    /// </summary>
    public sealed class STSSingleton
    {
        private static STSSingleton instance = null;
        private static readonly object padlock = new object();

        STSSingleton()
        {
        }

        public static STSSingleton Instance
        {
            get
            {
                lock (padlock)
                {
                    if (instance == null)
                    {
                        instance = new STSSingleton();
                    }
                    return instance;
                }
            }
        }
    }
}
